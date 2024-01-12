package com.estore.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.estore.db.DB;
import com.estore.shop.Item;

/**
 * Servlet implementation class BuyServlet
 */
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServletConfig config = getServletConfig(); //This call can only be made by the Servlet with params configured.
		
		String dbUrl = config.getInitParameter("dbUrl");
		
		String dbUser = config.getInitParameter("dbUser");
		
		String dbPwd = config.getInitParameter("dbPwd");
		
		System.out.println("Init params " + dbUrl + " " + dbUser + " " + dbPwd);
		
		
		ServletContext context = getServletContext(); //This call can be made by any Servlet
		
		String dbUrl2 = context.getInitParameter("dbUrl").toString();
		
		String dbUser2 = context.getInitParameter("dbUser").toString();
		
		String dbPwd2 = context.getInitParameter("dbPwd").toString();
		
		System.out.println("Context params " + dbUrl2 + " " + dbUser2 + " " + dbPwd2);
		
		
		HttpSession session = request.getSession();
		
		String user = "";
		
		if(session.getAttribute("user_email") != null) {
			user = session.getAttribute("user_email").toString();
		}
		
		//save the purchase to the database
		String itemName = request.getParameter("shoes");
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String purchaseDate = formatter.format(new Date());
		
		Float price = 0.0f;
		if(itemName.equals("runing")) {
			price = 20.0f;
		}
		else if(itemName.equals("walking")) {
			price = 20.0f;
		}
		else if(itemName.equals("hiking")) {
			price = 25.0f;
		}
		else if(itemName.equals("swimming")) {
			price = 30.0f;
		}
		
		Item item = new Item();
		
		item.setId(4);
		item.setCustomerID(user);
		item.setName(itemName);
		item.setPrice(price);
		
		DB db = new DB();
		db.createConnection();
		db.createItem(item);
		db.closeConnection();
		
		/*
		 * 
		CREATE TABLE Item(
		id int primary key,
		customerID varchar(250),
		name varchar(250),
		price float,
		purchaseDate varchar(250)
		);
		
		 */
		
		
		
		
	}

}
