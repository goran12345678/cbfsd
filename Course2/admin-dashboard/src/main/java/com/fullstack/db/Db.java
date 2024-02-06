package com.fullstack.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class Db {

	Connection connection;
	Statement statement;

	public Db() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			String user = "mysql";
			String password = "Pa$$W0rd";
			String url = "jdbc:mysql://localhost/jdbc";

			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Created");
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
	}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return connection;
	}

	public void closeConnection() {
		// TODO Auto-generated method stub
		try {
			connection.close();

			System.out.println("Connection Closed. Status: " + connection.isClosed());

		} catch (Exception e) {
			System.out.println("Exception Occured: " + e);
		}

	}

}
