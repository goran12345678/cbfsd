package com.estore.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.estore.db.MongoDB;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String msg;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Helloservlet - constructor executed");
        msg = "Thank you for shopping";
    }

    @Override
    public void init(ServletConfig config) throws ServletException{
    	super.init(config);
    	System.out.println("HelloServlet - init executed");
    }
    
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("HelloServlet - service executed");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		MongoDB db = new MongoDB();
		
		/*
		 * Cookie[] cookies = request.getCookies(); for(Cookie c: cookies) {
		 * out.println("<b>Cookies</b><br />"); out.println("<p>" + c.getName() + " : "
		 * + c.getValue() + "<p>"); }
		 */
		
		//out.print("<h3> " + msg + "</h3>");
		
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("HelloServlet - destroy executed");
	}
}
