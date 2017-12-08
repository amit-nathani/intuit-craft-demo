package com.intuit.craft.streaming.cassandra.tables;

import java.sql.Date;

public class AccountExpiring {

	private String item;
	private String created_date;
	private String company_id;
	private long expiration_ts;
	private String company_email;

	public AccountExpiring() {

	}

	public AccountExpiring(String item, long createdAt, String companyId, String companyEmail, long expirationTs) {
		this.item = item;
		this.created_date = new Date(createdAt).toString();
		this.company_id = companyId;
		this.expiration_ts = expirationTs;
		this.company_email = companyEmail;
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

	public long getExpiration_ts() {
		return expiration_ts;
	}

	public void setExpiration_ts(long expiration_ts) {
		this.expiration_ts = expiration_ts;
	}

	public String getCompany_email() {
		return company_email;
	}

	public void setCompany_email(String company_email) {
		this.company_email = company_email;
	}

}
