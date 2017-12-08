package com.intuit.craft.spark.batch.cassandra.tables;

import java.util.Arrays;
import java.util.List;

public enum CassandraTables {
	
	ACCOUNT_CREATED(new String[] {"message_dims.item","message_facts.execution_ts","company_id"}),
	ACCOUNT_EXPIRING(new String[] {"message_dims.item","message_facts.expiration_ts","message_facts.execution_ts","company_id","message_facts.company_email"}),
	SALES(new String[] {"message_dims.item","message_facts.execution_ts","company_id","message_dims.channel"});
	
	
	private List<String> fields;
	
	private CassandraTables(String[] fields) {
		this.fields = Arrays.asList(fields);
	}
	
	public List<String> getFields(){
		return this.fields;
	}
}
