package com.fullstack.MongoDbMaven;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.fullstack.MongoDbMaven.dal.DBOperations;
import com.fullstack.MongoDbMaven.model.Customer;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        DBOperations dbops = new DBOperations();
        
        //Customer customer = new Customer("Amy","123-444-5678","amy@gmail.com",80.0f, new Date(), new Date());
        //dbops.insertCustomer(customer);
        
        Customer customer2 = new Customer("Marty","22-234-5443","marty@hotmail.com",100.22f,new Date(), new Date());
        Customer customer3 = new Customer("Ryan","111-222-34567","ryan@gmail.com", 55.44f, new Date(), new Date());
        Customer customer4 = new Customer("Brian","333-111-2232","brain@zip.com",333.545f, new Date(), new Date());
        
        List<Document> customerList = Arrays.asList(customer2.getDocument(),customer3.getDocument(),customer4.getDocument());
        
        //dbops.insertCustomer(customerList);
        
        dbops.getAllCustomers();
        
        /*String connection = "mongodb+srv://root:root@cluster0.wevapgs.mongodb.net/?retryWrites=true&w=majority";
        try {
			MongoClient client = MongoClients.create(connection);
			System.out.println("Connection created sucessfully!");
			
			System.out.println(client.listDatabaseNames());
			Iterator itr = client.listDatabaseNames().iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next().toString());
			}
			
			MongoDatabase db = client.getDatabase("estore");
			System.out.println("Collection names:");
			System.out.println(db.listCollectionNames());
			Iterator itr2 = db.listCollectionNames().iterator();
			while(itr2.hasNext()) {
				System.out.println("Colleciton: " + itr2.next().toString());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong!");
			System.out.print("Message: " + e.getMessage());
		}*/
        
    }
}
