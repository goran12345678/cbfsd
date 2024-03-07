package com.fullstack.springcloudfeignclientdemo.model;

public class Product {
	String name;
	Integer price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String name, Integer price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}
