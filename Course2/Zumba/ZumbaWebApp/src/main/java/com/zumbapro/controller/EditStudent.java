package com.zumbapro.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditStudent
 */
public class EditStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id =request.getParameter("Id");
		String name =request.getParameter("stdName");
		String email =request.getParameter("stdEmail");
		String phone =request.getParameter("stdPhone");
		String age =request.getParameter("stdAge");
		
		if(id != "") {
			//edit specific student
			System.out.println("Edit student id " + id);
		}else {
			//add new student
			System.out.println("Add student " + name);
		}
	}

}
