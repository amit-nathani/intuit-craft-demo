# intuit-craft-demo

![alt text](https://github.com/amit-nathani/intuit-craft-demo/blob/master/docs/craft_demo_architecture.jpeg)

Please refer to config directory for all configurations for Kafka and Hadoop setup

## Start Kafka
##### Run Zookeeper
`cd kafka_2.11-1.0.0 && /bin/zookeeper-server-start.bat config/zookeeper.properties`

##### Run first kafka broker
`cd kafka_2.11-1.0.0 && /bin/kafka-server-start.bat config/server.properties`

##### Run second kafka broker
`cd kafka_2.11-1.0.0 && /bin/kafka-server-start.bat config/server2.properties`

##### Run Schema Registry
`cd confluent-4.0.0 && /bin/schema-registry-start.bat etc/schema-registry/schema-registry.properties`

##### Run kafka avro consumer
`cd confluent-4.0.0 && /bin/kafka-avro-console-consumer --bootstrap-server localhost:9092 --topic craft_trial --from-beginning`

## Start Hadoop
Verify core-site.xml, hive-site.xml, mapred-site.xml, yarn-site.xml files in hadoop/etc/hadoop directory. Set hadoop related environment variables.

##### Start Yarn
`cd hadoop && /sbin/start-yarn.sh`

##### Start Hadoop
`cd hadoop && /sbin/start-dfs.sh`

##### Start Hive
Create metastore database, hiveuser in mysql. Give all the permission to hiveuser on metastore database.
Verify hive-site.xml as shown in resources
Copy mysql-connector-java-5.1.45-bin.jar in hive/lib directory and run below mentioned command.

`hive`

## Cassandra setup
Start cassandra server. 

Cassandra tables are mentioned in database/create_cassandra_tables.txt.
 
Create all tables in both batch and real time keyspaces.

## Build intuit-craft-demo Project
Verify configuration in craft_config.properties file and make necessary changes based on your setup

mvn clean package
##### Run Kafka event generation code
Run com.intuit.craft.producer.TrialEventProducer class to generate Trial events into Kafka

##### Run kafka connect to push data from kafka to hdfs/hive
cd confluent-4.0.0 && /bin/connect-standalone etc/schema-registry/connect-avro-standalone.properties etc/kafka-connect-hdfs/quickstart-hdfs.properties

##### Run streaming job
Verify configuration in streaming-config.properties file and make necessary changes based on your setup.

Run com.intuit.craft.streaming.TrialStreamingJob class to run Streaming job which reads events from Kafka and pushes them to Cassandra realtime view


##### Run batch job
Run com.intuit.craft.streaming.TrialBatchJob class to run Streaming job which reads events from Kafka and pushes those to Cassandra realtime view



