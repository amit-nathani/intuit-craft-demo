package com.intuit.craft.spark.batch.job;

import static com.intuit.craft.spark.batch.cassandra.tables.CassandraTables.ACCOUNT_CREATED;
import static com.intuit.craft.spark.batch.cassandra.tables.CassandraTables.ACCOUNT_EXPIRING;
import static com.intuit.craft.spark.batch.cassandra.tables.CassandraTables.SALES;
import static org.apache.spark.sql.functions.from_unixtime;
import static org.apache.spark.sql.functions.to_date;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.spark.sql.Column;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import com.intuit.craft.spark.batch.cassandra.tables.CassandraTables;
import com.intuit.craft.spark.batch.constants.CraftConstants;


/*
 * This job will fetch data from hive, transform it and push it to cassandra tables.
 * For simplicity, it is fetching all data from hive table.
 */
public class TrialBatchJob {

	public static void main(String[] args) {
		SparkSession spark = null;
		try {

			// Properties config = loadConfiguration();

			// Verify property values
			
			//Use property values instead of String literals

			spark = SparkSession.builder().master("local").appName("Java Spark Hive Example")
					.config(CraftConstants.SPARK_HIVE_METASTORE_URI, "hive2://0.0.0.0:9083")
					.config(CraftConstants.SPARK_HIVE_EXEC_SCRATCHDIR, "hdfs://0.0.0.0:19000/tmp/hive/")
					.config(CraftConstants.SPARK_CASSANDRA_CONNECTION_HOST, "127.0.0.1").enableHiveSupport()
					.getOrCreate();

			Dataset<Row> craftTrialDF = spark.sql("select * from intuit_cd.craft_trial1");

			/* 
			 * caching created dataset as we are going to use it to create 3 different
			 * datasets for 3 different cassandra trables
			 */
			craftTrialDF.cache();

			Column[] createdColumns = getColumns(ACCOUNT_CREATED);
			Column[] expiringColumns = getColumns(ACCOUNT_EXPIRING);
			Column[] salesColumns = getColumns(SALES);

			//creating dataframe for account_created table
			Dataset<Row> accCreatedDF = craftTrialDF.select(createdColumns);
			Dataset<Row> tempAccCreatedDF = accCreatedDF.withColumn("created_date",
					to_date(from_unixtime(accCreatedDF.col("execution_ts"))));
			Dataset<Row> cassAccCreatedDF = tempAccCreatedDF.withColumnRenamed("execution_ts", "created_at");
			
			//creating dataframe for account_expiring table
			Dataset<Row> accExpiringDF = craftTrialDF.select(expiringColumns);
			Dataset<Row> tempAccExpiringDF = accExpiringDF.withColumn("created_date",
					to_date(from_unixtime(accExpiringDF.col("execution_ts"))));
			Dataset<Row> cassAccExpiringDF = tempAccExpiringDF.drop(new Column("execution_ts"));

			//creating dataframe for sales table
			Dataset<Row> salesDF = craftTrialDF.select(salesColumns);
			Dataset<Row> tempSalesDF = salesDF.withColumn("created_date",
					to_date(from_unixtime(salesDF.col("execution_ts"))));
			Dataset<Row> cassSalesDF = tempSalesDF.withColumnRenamed("execution_ts", "created_at");

			//saving all dataframes to appropriate tables in cassandra
			saveToCassandra(cassAccCreatedDF, "trial_batch_view", "account_created");
			saveToCassandra(cassAccExpiringDF, "trial_batch_view", "account_expiring");
			saveToCassandra(cassSalesDF, "trial_batch_view", "sales");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (spark != null) {
				spark.stop();
			}
		}
	}

	private static Column[] getColumns(CassandraTables table) {
		List<Column> columns = new ArrayList<Column>();
		for (String field : table.getFields()) {
			columns.add(new Column(field.toString()));
		}
		return columns.stream().toArray(Column[]::new);
	}

	private static void saveToCassandra(Dataset<Row> record, String keyspace, String table) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("table", table);
		map.put("keyspace", keyspace);
		record.write().mode("append").format("org.apache.spark.sql.cassandra").options(map).save();

	}

	// private static Properties loadConfiguration() {
	// Properties properties = null;
	// InputStream input = null;
	// try {
	// System.out.println(CraftConstants.CONFIG_FILE_NAME);
	// input = new FileInputStream(CraftConstants.CONFIG_FILE_NAME);
	// properties = new Properties();
	// properties.load(input);
	// } catch (IOException ex) {
	// System.out.println("Couldn't find configuration file. Please validate config
	// file.");
	// } finally {
	// if (input != null) {
	// try {
	// input.close();
	// } catch (IOException e) {
	// System.out.println("Unable to close the InputStream for configuration file. :
	// " + e.getMessage());
	// }
	// }
	// }
	// return properties;
	// }
}