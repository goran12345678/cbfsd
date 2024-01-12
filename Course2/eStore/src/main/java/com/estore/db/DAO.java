package com.estore.db;

import java.util.ArrayList;

import com.estore.shop.Item;


public interface DAO {
	//declare method for CRUD operations
	
	void createConnection();
	void closeConnection();
	
	void createItem(Item item);
	void deleteItem(int id);
	ArrayList<Item> getItems(String customerId);
	

}
