package com.fullstack.springbootmongodatabase.model;

public class Address {
	String adrsLine;
	String suiteNumber;
	String city;
	String state;
	Integer zipCode;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String adrsLine, String suiteNumber, String city, String state, Integer zipCode) {
		this.adrsLine = adrsLine;
		this.suiteNumber = suiteNumber;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public String getAdrsLine() {
		return adrsLine;
	}
	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}
	public String getSuiteNumber() {
		return suiteNumber;
	}
	public void setSuiteNumber(String suiteNumber) {
		this.suiteNumber = suiteNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZipCode() {
		return zipCode;
	}
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [adrsLine=" + adrsLine + ", suiteNumber=" + suiteNumber + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}

}
