package com.intuit.craft.spark.batch.constants;

public class CraftConstants {
//	public static final String CONFIG_FILE_PATH = "hdfs:///tmp/";
	public static final String CONFIG_FILE_NAME = "batch-job.properties";
	
	//Spark config
	public static final String SPARK_MASTER = "spark.master";
	public static final String SPARK_HIVE_METASTORE_URI = "spark.hive.metastore.uris";
	public static final String SPARK_HIVE_EXEC_SCRATCHDIR = "spark.hive.exec.scratchdir";
	public static final String SPARK_CASSANDRA_CONNECTION_HOST = "spark.cassandra.connection.host";
	
	//Hive table config
	public static final String HIVE_DB = "hive.database";
	public static final String HIVE_TABLE = "hive.table";
	
	//Cassandra table config
	public static final String CASSANDRA_KEYSPACE = "cassandra.keyspace";
	public static final String CASSANDRA_TABLES = "cassandra.tables";
	
	
	

	
	
//			hive.database = intuit_cd
//			hive.table = craft_trial
//
//			#cassandra table related properties
//			cassandra.keyspace = trial
//			cassandra.tables = account_created, account_expiring, sales
//			cassandra.table.account_created.fields = message_dims.item,message_facts.execution_ts,company_id
//			cassandra.table.account_expiring.fields = message_dims.item,message_facts.expiration_ts,company_id,message_facts.company_email
//			cassandra.table.sales.fields = message_dims.item,message_facts.execution_ts,company_id,message_dims.channel,sales
//
//			#spark properties
//			spark.master=local
//			spark.hive.metastore.uris=hive2://0.0.0.0:9083
//			spark.hive.exec.scratchdir=hdfs://0.0.0.0:19000/tmp/hive/
//			spark.cassandra.connection.host=127.0.0.1 
}
