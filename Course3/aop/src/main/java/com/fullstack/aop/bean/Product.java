package com.fullstack.aop.bean;

public class Product {
	int id;
	String name;
	int price;
	String brand;
	int stock;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void purchaseProduct(String deliveryLocation, String deliveryTime, String userEmail) {
		System.out.println("[Product] - Validating Stock....");
		if(stock > 0) {
			System.out.println("[Product] - Please initiate the transaction for amount of " + price);
			System.out.println();
			
			System.out.println("[Product] Thank you " + userEmail + " for buying " + name + " of " + brand);
			
			System.out.println("[Product] Product " + brand + " " + name + " will be delivered at " 
			+ deliveryLocation + " on " + deliveryTime);
		}
	}
	public void purchaseNow() {
		System.out.println("[Product] - Purchasae Now....");
		if(stock > 0) {
			System.out.println("[Product] - Please initiate the transaction for amount of " + price);
			System.out.println();
			
		}
	}
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", stock=" + stock
				+ "]";
	}
	

}
