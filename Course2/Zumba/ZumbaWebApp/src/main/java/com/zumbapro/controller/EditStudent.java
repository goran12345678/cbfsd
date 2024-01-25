package com.zumbapro.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.zumbapro.common.DbMethods;
import com.zumbapro.db.DB;
import com.zumbapro.model.Student;

import jakarta.servlet.RequestDispatcher;
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
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		// TODO Auto-generated method stub
		String id =request.getParameter("stdId");
		String name =request.getParameter("stdName");
		String email =request.getParameter("stdEmail");
		String phone =request.getParameter("stdPhone");
		String age =request.getParameter("stdAge");
		
		Student student = new Student();
		student.setAge(age);
		student.setEmail(email);
		student.setName(name);
		student.setPhone(phone);
		
		if(id == null || id == "") {
			//add new student
			int result = DbMethods.addStudent(student);
			if(result > 0) {
				writer.print("student added succesfully!!");
			}else {
				writer.print("student was not added!!");
			}
		}else {
			//edit existing student
			int result = DbMethods.editStudent(student);
			if(result > 0) {
				writer.print("student changed succesfully!!");
			}else {
				writer.print("student was not changed!!");
			}
		}
		
		writer.print("<br /><a href='GetStudent'>Return </a>");

	}
	

}
