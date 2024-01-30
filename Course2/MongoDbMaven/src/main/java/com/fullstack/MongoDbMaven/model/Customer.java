package com.fullstack.MongoDbMaven.model;

import java.util.Date;

import org.bson.Document;

public class Customer {
	String name;
	String phone;
	String email;
	Float temperature;
	Date intime;
	Date outtime;
	
	public Customer(String name, String phone, String email, Float temperature, Date intime, Date outtime) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.temperature = temperature;
		this.intime = intime;
		this.outtime = outtime;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + ", temperature=" + temperature
				+ ", intime=" + intime + ", outtime=" + outtime + "]";
	}
	
	public Document getDocument() {
		Document document = new Document();
		document.append("name", name);
		document.append("phone", phone);
		document.append("email", email);
		document.append("temperature", temperature);
		document.append("intime", intime);
		document.append("outtime", outtime);
		
		return document;
	}
	
}
