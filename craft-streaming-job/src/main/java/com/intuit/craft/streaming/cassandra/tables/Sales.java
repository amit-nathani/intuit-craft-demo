package com.intuit.craft.streaming.cassandra.tables;

import java.sql.Date;

public class Sales {

	private String item;
	private String created_date;
	private String company_id;
	private long created_at;
	private String channel;
	private double sales;

	public Sales() {

	}

	public Sales(String item, long createdAt, String companyId, String channel, double sales) {
		this.item = item;
		this.created_date = new Date(createdAt).toString();
		this.created_at = createdAt;
		this.company_id = companyId;
		this.channel = channel;
		this.sales = sales;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public long getCreated_at() {
		return created_at;
	}

	public void setCreated_at(long created_at) {
		this.created_at = created_at;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

}
