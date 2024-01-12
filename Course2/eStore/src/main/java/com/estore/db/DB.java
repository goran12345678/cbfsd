package com.estore.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.estore.shop.Item;


public class DB implements DAO {
	Connection connection;
	Statement statement;
	
	public DB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
		}catch(Exception e) {
			System.out.println("Exception occured");
		}
		
	}

	public void createConnection() {
		// TODO Auto-generated method stub
		try {
			String user = "mysql";
			String password = "Pa$$W0rd";
			String url ="jdbc:mysql://localhost/jdbc";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Created");
			
		}catch(Exception e) {
			System.out.println("Exception Occured: " + e);
		}
	}

	public void closeConnection() {
		// TODO Auto-generated method stub
		try {
			connection.close();
			
			System.out.println("Connection Closed. Status: " + connection.isClosed());
			
		}catch(Exception e) {
			System.out.println("Exception Occured: " + e);
		}
		
	}


	@Override
	public void createItem(Item item) {
		// TODO Auto-generated method stub
		
		try {
			
			String sql = "insert into Item values(" + item.getId() + ",'" + item.getCustomerID() + "','"
					+ item.getName() + "'," + item.getPrice() + ",'"
					+ item.getPurchaseDate() + "')";
		
			statement = connection.createStatement();
			int result = statement.executeUpdate(sql);
			String message = result > 0 ? "Item added" : "Item not added";
			System.out.println(message);
			
		}catch(Exception e) {
			System.out.println("Exception Occured: " + e);
		}
		
	}

	@Override
	public void deleteItem(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Item> getItems(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
