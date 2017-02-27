package com.basic;

public class Mobile {
	private String companyname;
	private long number;
	public Mobile(String companyname, long number)
	{
		setCompanyname(companyname);
		setNumber(number);
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString()
	{
		return companyname+"     "+getNumber();
	}

}
