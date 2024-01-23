package com.zumbapro.model;

import java.io.Serializable;

/*
 * Class represents a group of student exercising at a specific time.
 */
public class Batch implements Serializable{
	
	String Id;
	String name;
	String email;
	String phone;
	String age;
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "id: " + id + " email: " + email;
	}
}
