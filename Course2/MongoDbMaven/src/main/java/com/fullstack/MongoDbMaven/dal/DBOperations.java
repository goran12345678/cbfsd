package com.fullstack.MongoDbMaven.dal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.fullstack.MongoDbMaven.model.Customer;
import com.fullstack.MongoDbMaven.util.Util;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DBOperations {
	
	MongoClient client;
	MongoDatabase database;
	MongoCollection collection;
	
	public DBOperations() {
		super();
		// TODO Auto-generated constructor stub
        String connection = "mongodb+srv://root:root@cluster0.wevapgs.mongodb.net/?retryWrites=true&w=majority";
        try {
			client = MongoClients.create(connection);
			database = client.getDatabase(Util.DB_NAME);
			collection = database.getCollection(Util.DB_COLLECTION);
			
			Iterator itr = client.listDatabaseNames().iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next().toString());
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong in DBOperations()!");
			System.out.print("Message: " + e.getMessage());
		}
        
		
	}
	
	public void insertCustomer(Customer customer) {
		
		try {
			
			Document doc = customer.getDocument();
			collection.insertOne(doc);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong in insertCustomer(customer)");
			System.out.println("Message: " + e.getMessage());
		}
		
	}
	//overload method
	public void insertCustomer(List<Document> customers) {
		
		try {
			collection.insertMany(customers);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong in insertCustomer(customers)");
			System.out.println("Message: " + e.getMessage());
		}
	}
	
	public List<Customer> getAllCustomers(){
		List<Customer> customers = new ArrayList<Customer>();
		
		List<Document> documents = (List<Document>) collection.find().into(new ArrayList<Document>());
		for(Document doc: documents) {
			System.out.println(doc.toJson());
			//Customer customer = new Customer(doc.get("name").toString(),doc.get("phone").toString(), doc.get("email").toString(), doc.get("temperature").toString(),doc.get("intime").toString(),doc.get("outtime").toString());
		}
		
		
		return customers;
	}

}
