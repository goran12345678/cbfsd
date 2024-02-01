package com.fullstack.MongoDbMaven.dal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.fullstack.MongoDbMaven.model.Customer;
import com.fullstack.MongoDbMaven.util.Util;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.model.ReturnDocument;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

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
			while (itr.hasNext()) {
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

	// overload method
	public void insertCustomer(List<Document> customers) {

		try {
			collection.insertMany(customers);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong in insertCustomer(customers)");
			System.out.println("Message: " + e.getMessage());
		}
	}

	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();

		Bson filter = Filters.eq("name", "Marty");

		filter = Filters.expr("temperature $lt 100");

		filter = Filters.and(Filters.eq("name", "Marty"), Filters.gt("temperature", 100));

		filter = Filters.in("phone", "22-234-00000 ", "33");

		filter = Filters.regex("phone", "^[22*]");

		Bson sort = Sorts.descending("name");
		Bson sort2 = Sorts.descending("temperature");

		List<Document> documents = (List<Document>) collection.find().sort(sort).into(new ArrayList<Document>());

		for (Document doc : documents) {
			System.out.println(doc.toJson());
			Customer customer = new Customer(doc.get("name").toString(), doc.get("phone").toString(),
					doc.get("email").toString(), Float.parseFloat(doc.get("temperature").toString()),
					new Date(doc.get("intime").toString()), new Date(doc.get("outtime").toString()));
		}

		return customers;
	}

	public void updateCustomer(String email, String key, String value) {

		Bson filter = Filters.eq("email", email);
		Bson update = Updates.set(key, value);

		try {
			UpdateResult result = collection.updateOne(filter, update);
			if (result.getMatchedCount() > 0) {
				System.out.println("Customer " + email + " was changed");
			} else {
				System.out.println("Customer " + email + " not found");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Document updateCustomerDoc(String email, String key, String value) {
		Document doc = null;

		Bson filter = Filters.eq("email", email);
		Bson update = Updates.set(key, value);

		try {

			FindOneAndUpdateOptions options = new FindOneAndUpdateOptions().returnDocument(ReturnDocument.AFTER);

			doc = (Document) collection.findOneAndUpdate(filter, update, options);

			if (doc != null) {
				System.out.println("Customer " + email + " was changed");
				System.out.println("Document " + doc.toJson());
			} else {
				System.out.println("Customer " + email + " not found");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return doc;

	}

	public void upsertCustomer(String email, String key, String value) {
		Bson filter = Filters.eq("email", email);
		Bson update = Updates.push(key, value);

		try {
			UpdateResult result = collection.updateOne(filter, update);
			if (result.getMatchedCount() > 0)
				System.out.println("Customer " + email + " was updated");
			else
				System.out.println("Customer " + email + " was not updated");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void upsertAllCustomerVersion() {
		Bson filter = Filters.exists("email");
		Bson update = Updates.push("version", "1.0");

		try {
			UpdateResult result = collection.updateMany(filter, update);
			if (result.getMatchedCount() > 0)
				System.out.println("Customers version was updated");
			else
				System.out.println("Customers version was not updated");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void resetTemperatureToAll() {
		Bson filter = Filters.gt("temperature", 0);
		Bson update = Updates.set("temperature", 0f);
		try {
			UpdateResult result = collection.updateMany(filter, update);
			if (result.getModifiedCount() > 0)
				System.out.println("All customer have reset temperature");
			else
				System.out.println("No customers were reset");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteCustomer(String email) {
		Bson filter = Filters.eq("email", email);
		try {
			DeleteResult result = collection.deleteOne(filter);
			if (result.getDeletedCount() > 0)
				System.out.println("Customer " + email + " was deleted");
			else
				System.out.println("Customer " + email + " was not delted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteCustomerWithAge() {
		Bson filter = Filters.exists("age");

		try {
			DeleteResult result = collection.deleteMany(filter);
			if (result.getDeletedCount() > 0)
				System.out.println("All customer with age were deleted");
			else
				System.out.println("Customers with age were not deleted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteCollection(String collectionName) {

		try {
			collection = database.getCollection(collectionName);
			collection.drop();
			System.out.println("Collection " + collectionName + " was deleted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
