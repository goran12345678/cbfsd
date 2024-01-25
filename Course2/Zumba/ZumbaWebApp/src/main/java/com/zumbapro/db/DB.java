
package com.zumbapro.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
	
	Connection connection;
	PreparedStatement pStatement;
	
	//empty constructor
	public DB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/zumba";
			String user = "zumba";
			String password = "Pa$$w0rd";
			connection = DriverManager.getConnection(url,user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public Connection getConnection() {
		return connection;
	}

	public void closeConnection() {
		try {
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param statement
	 * @return
	 */
	public int executeUpdate(PreparedStatement statement) {
		int result = 0;
		try {
			result = statement.executeUpdate(); //returns the number of rows affected
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ResultSet executeQuery(PreparedStatement statement) {
		ResultSet result = null;
		try {
			result = statement.executeQuery();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
