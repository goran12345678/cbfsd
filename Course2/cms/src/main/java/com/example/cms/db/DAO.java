package com.example.cms.db;

import java.util.ArrayList;

import com.example.cms.model.Customer;

public interface DAO {
	//declare method for CRUD operations
	
	void createConnection();
	void closeConnection();
	
	void createCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int cid);
	ArrayList<Customer> getCustomers();
	

}
