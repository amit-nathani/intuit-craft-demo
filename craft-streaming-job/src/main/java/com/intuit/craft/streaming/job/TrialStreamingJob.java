package com.intuit.craft.streaming.job;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka010.ConsumerStrategies;
import org.apache.spark.streaming.kafka010.KafkaUtils;
import org.apache.spark.streaming.kafka010.LocationStrategies;

import com.datastax.spark.connector.japi.CassandraJavaUtil;
import com.intuit.craft.streaming.avro.Trial;
import com.intuit.craft.streaming.cassandra.tables.AccountCreated;
import com.intuit.craft.streaming.cassandra.tables.AccountExpiring;
import com.intuit.craft.streaming.cassandra.tables.Sales;
import com.intuit.craft.streaming.config.ConfigFactory;
import com.intuit.craft.streaming.config.StreamingConstants;

import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;

/*
 * This job is used to get real time data from kafka, transform it and push it to cassandra real time view.
 * TODO: Need to set expiration time for row inserted into real time view tables.
 * Because data in this view is no longer needed once batch data for this time period is pushed to cassandra batch view.
 */
public class TrialStreamingJob {

	public static void main(String[] args) {
		Properties properties = ConfigFactory.loadConfiguration();

		SparkSession spark = SparkSession.builder().master("local").appName("streaming")
				.config("spark.driver.allowMultipleContexts", true)
				.config("spark.cassandra.connection.host", "127.0.0.1").getOrCreate();
		System.out.println("Test 2");
		int batchInterval = Integer.parseInt(properties.getProperty(StreamingConstants.SPARK_BATCH_INTERVAL));

		JavaStreamingContext ctx = new JavaStreamingContext(spark.sparkContext().conf(), new Duration(batchInterval));
		String groupId = properties.getProperty(StreamingConstants.KAFKA_GROUP_ID);
		String topic = properties.getProperty(StreamingConstants.KAFKA_TOPIC_NAME);
		Set<String> topics = new HashSet<String>();
		topics.add(topic);
		Map<String, Object> kafkaParams = new HashMap<String, Object>();
		kafkaParams.put("bootstrap.servers", properties.getProperty(StreamingConstants.KAFKA_BOOTSTRAP_SERVERS));
		kafkaParams.put("schema.registry.url", properties.getProperty(StreamingConstants.SCHEMA_REGISTRY_URL));
		kafkaParams.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		kafkaParams.put("value.deserializer", "io.confluent.kafka.serializers.KafkaAvroDeserializer");
		kafkaParams.put("group.id", groupId);
		kafkaParams.put("auto.offset.reset", "latest");
		kafkaParams.put("enable.auto.commit", false);
		kafkaParams.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, "true");
		kafkaParams.put(KafkaAvroDeserializerConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");

		JavaInputDStream<ConsumerRecord<String, Trial>> inputStream = KafkaUtils.createDirectStream(ctx,
				LocationStrategies.PreferConsistent(),
				ConsumerStrategies.<String, Trial>Subscribe(topics, kafkaParams));
		JavaDStream<Trial> stream = inputStream.map(new Function<ConsumerRecord<String, Trial>, Trial>() {

			private static final long serialVersionUID = 1093946507398528416L;

			@Override
			public Trial call(ConsumerRecord<String, Trial> kafkaRecord) throws Exception {
				return kafkaRecord.value();
			}
		});

		stream.foreachRDD((rdd) -> {

			//Caching rdd to use it to get various rdds for different cassandra tables
			rdd.cache();

			//Creating rdd for account_created table in cassandra and saving it
			JavaRDD<AccountCreated> accCreatedRdd = rdd.map((trial) -> {
				return new AccountCreated(trial.getMessageDims().getItem().toString(),
						trial.getMessageFacts().getExecutionTs(), trial.getCompanyId().toString());
			});
			CassandraJavaUtil.javaFunctions(accCreatedRdd)
					.writerBuilder("trial_real_time_view", "account_created", CassandraJavaUtil.mapToRow(AccountCreated.class))
					.saveToCassandra();

			//Creating rdd for account_expiring table in cassandra and saving it
			JavaRDD<AccountExpiring> accExpRdd = rdd.map((trial) -> {
				return new AccountExpiring(trial.getMessageDims().getItem().toString(),
						trial.getMessageFacts().getExecutionTs(), trial.getCompanyId().toString(),
						trial.getMessageFacts().getCompanyEmail().toString(),
						trial.getMessageFacts().getExpirationTs());
			});
			CassandraJavaUtil.javaFunctions(accExpRdd)
					.writerBuilder("trial_real_time_view", "account_expiring", CassandraJavaUtil.mapToRow(AccountExpiring.class))
					.saveToCassandra();

			//Creating rdd for sales table in cassandra and saving it
			JavaRDD<Sales> salesRdd = rdd.map((trial) -> {
				return new Sales(trial.getMessageDims().getItem().toString(), trial.getMessageFacts().getExecutionTs(),
						trial.getCompanyId().toString(), trial.getMessageDims().getChannel().toString(),
						trial.getMessageFacts().getProductPrice() * trial.getMessageFacts().getQuantity());
			});
			CassandraJavaUtil.javaFunctions(salesRdd)
					.writerBuilder("trial_real_time_view", "sales", CassandraJavaUtil.mapToRow(Sales.class)).saveToCassandra();

		});

		ctx.start();
		try {
			ctx.awaitTermination();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			spark.stop();
		}
	}

}
