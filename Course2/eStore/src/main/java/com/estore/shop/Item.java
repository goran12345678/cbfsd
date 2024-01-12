package com.estore.shop;

public class Item {
	
	int id; //unique record id in the database
	String customerID; //customer who made purchase
	String name;  //item name
	float price; //item price
	String purchaseDate; //item purchase date
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
