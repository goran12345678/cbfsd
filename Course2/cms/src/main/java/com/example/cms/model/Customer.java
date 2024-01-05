package com.example.cms.model;

/*
  CREATE TABLE Customer{
  	id int primary key,
  	name varchar(256),
  	phone varchar(256),
  	email varchar(256),
  	birthDate date,
  	age int,
  	registeredOn datetime,
  	temperature float,
  	
  }
  
 */

public class Customer {

	Integer id;
	String name;
	String phone;
	String email;
	String birthDate;
	Integer age;
	String registeredOn;
	Float temperature;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String phone, String email, String birthDate, Integer age, String registeredOn,
			Float temperature) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.birthDate = birthDate;
		this.age = age;
		this.registeredOn = registeredOn;
		this.temperature = temperature;
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getRegisteredOn() {
		return registeredOn;
	}

	public void setRegisteredOn(String registeredOn) {
		this.registeredOn = registeredOn;
	}

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + ", birthDate=" + birthDate
				+ ", age=" + age + ", registeredOn=" + registeredOn + ", temperature=" + temperature + "]";
	}
	

}
