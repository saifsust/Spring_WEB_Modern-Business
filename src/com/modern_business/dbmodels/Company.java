package com.modern_business.dbmodels;

public class Company {

	private int companyId;
	private String companyName;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(String companyName) {
		super();
		this.companyName = companyName;
	}
	public Company(int companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + "]";
	}
	
	

}
