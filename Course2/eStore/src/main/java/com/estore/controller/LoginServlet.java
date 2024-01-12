package com.estore.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.estore.session.SessionManager;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String EMAIL = "tom@jones.com";
	private static final String PASSWSORD = "password";
	private static final String COOKIE_NAME = "USER_NAME";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String id = request.getParameter("id");

		response.setContentType("text/html"); // HTTP header added
		PrintWriter out = response.getWriter(); // the stream writer

		HttpSession session = request.getSession(); // storage specific to a client

		if (session.getAttribute("user_email") == null) {
			if (email.equals(EMAIL) && password.equals(PASSWSORD)) {
				// valid login
				session.setAttribute("user_email", email);
				out.print("succesfull login");
				
			} else {
				out.print("log failed");
			}
		}else {
			
			String user = "";
			
			if(session.getAttribute("user_email") != null) {
				user = session.getAttribute("user_email").toString();
			}
			out.print("you are already logged in as " + user);
		}

		/// System.out.print("User login: " + email + " " + password);
		/*
		 * Cookie[] cookies = request.getCookies(); if
		 * (SessionManager.doesCookieExist(COOKIE_NAME, cookies)) {
		 * out.println("<b>Your session is still valid</b>"); } else { if
		 * (email.equals(EMAIL) && password.equals(PASSWSORD)) {
		 * 
		 * Cookie cookie = new Cookie(COOKIE_NAME, email); response.addCookie(cookie); }
		 * else {
		 * 
		 * out.println("<b>incorrect login!</b>"); } }
		 */

		// String html = "<center><h3>Hello " + id + "</h3></center>";

		// out.print(html); // send message body to the browser. the message is html

	}

}
