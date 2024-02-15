package com.fullstack.dependencyinjection.bean;

public class Restaurant {
	String name;
	String phone;
	String operatingHours;
	float ratings;
	Address address;
	public Restaurant() {
		// TODO Auto-generated constructor stub
		System.out.println("[Restaurant] - Object Constructor");
	}
	public Restaurant(Address address) { //Constructor Dependency Injection
		// TODO Auto-generated constructor stub
		System.out.println("[Restaurant] - Object DI Constructor");
		this.address = address;
	}
	public String getName() {
		return name;
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
	public String getOperatingHours() {
		return operatingHours;
	}
	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", operatingHours=" + operatingHours + ", ratings="
				+ ratings + ", address=" + address + "]";
	}
	

}
