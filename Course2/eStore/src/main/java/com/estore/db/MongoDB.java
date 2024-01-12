package com.estore.db;

import com.estore.shop.Item;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDB {

	public MongoDB() {
		super();
		// TODO Auto-generated constructor stub
    
        String connectionString = "mongodb+srv://root:root@cluster0.wevapgs.mongodb.net/?retryWrites=true&w=majority";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection
                MongoDatabase database = mongoClient.getDatabase("eStore");
                database.runCommand(new Document("ping", 1));
                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
        
        Item item = new Item();
        
        item.setId(5);
        item.setCustomerID("tom@jones.com");
        item.setName("walker");
        item.setPrice(20.0f);
        item.setPurchaseDate("2024/01/12 11:22:11");
        
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("id: 5,");
        sb.append("customerID: '" + item.getCustomerID() + "',");
        sb.append("name: '" + item.getName() + "',");
        sb.append("price: " + item.getPrice() + ",");
        sb.append("pruchaseDate: '" + item.getPurchaseDate() + "'");
        sb.append("}");
        
        String json = sb.toString();
        
        
    }
}


