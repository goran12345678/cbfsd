package com.example.cms.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.example.cms.model.Customer;

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

	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
			
			SimpleDateFormat pattern1 = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
			
			Date date = new Date();
			String date1 = pattern1.format(date);
			
			System.out.println("Date: " + date1);
			
			String sql = "insert into Customer values(" + customer.getId() + ",'" + customer.getName() + "','"
					+ customer.getPhone() + "','" + customer.getEmail() + "','"
					+ customer.getBirthDate() +  "'," + customer.getAge() + ",'" + date1 + "'," 
					+ customer.getTemperature() + ")";
		
			statement = connection.createStatement();
			int result = statement.executeUpdate(sql);
			String message = result > 0 ? "Customer created" : "Customer not created";
			System.out.println(message);
			
		}catch(Exception e) {
			System.out.println("Exception Occured: " + e);
		}
		
	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
			
		}catch(Exception e) {
			System.out.println("Exception Occured: " + e);
		}
		
	}

	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		try {
			
		}catch(Exception e) {
			System.out.println("Exception Occured: " + e);
		}
	}

	public ArrayList<Customer> getCustomers() {
		// TODO Auto-generated method stub
		try {
			
		}catch(Exception e) {
			System.out.println("Exception Occured: " + e);
		}
		return null;
	}

}
