package com.zumbapro.model;

import java.io.Serializable;

/*
 * Class represents a student attending a Zumba session
 */
public class Student implements Serializable{
	String id ;
	String name;
	String email;
	String phone;
	String age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		id = id;
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

	@Override
	public String toString() {
		return "id: " + id +" name: " + name;
	}
}
