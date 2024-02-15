package com.fullstack.dependencyinjection.bean;

public class FoodItem {
	String name;
	int price;

	public FoodItem() {
		// TODO Auto-generated constructor stub
		System.out.println("[FoodItem] - Object Created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItem [name=" + name + ", price=" + price + "]";
	}
}
