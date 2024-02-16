package com.fullstack.dependencyinjection.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

	String name;
	String email;
	
	Order order;
	public User() {
		// TODO Auto-generated constructor stub
		System.out.println("[User] - Object Created");
	}
	@Autowired 
	public User(Order order) {
		// TODO Auto-generated constructor stub
		System.out.println("[User] - Object Constructor DI Created");
		this.order = order;
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
	public Order getOrder() {
		return order;
	}
	//@Autowired //DI on setters
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", order=" + order + "]";
	}
}
