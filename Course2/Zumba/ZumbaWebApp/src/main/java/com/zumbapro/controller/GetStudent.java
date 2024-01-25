package com.zumbapro.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
 * Servlet implementation class GetStudent
 */
public class GetStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id = request.getParameter("id");
		
		if(id != null && id != "") {
			//get specific student
			System.out.println("Returned student id " + id);
			
			ArrayList<Student> students = DbMethods.getStudent(id);
			
			request.setAttribute("student", students);
			RequestDispatcher dispatcher  = request.getRequestDispatcher("studentedit.jsp");
			dispatcher.forward(request, response);
			
		}else {
			//get all students
			System.out.println("Returned all students");
			ArrayList<Student> students = DbMethods.getStudent();
			
			request.setAttribute("students", students);
			
			RequestDispatcher dispatcher  = request.getRequestDispatcher("studentedit.jsp");
			dispatcher.forward(request, response);
		}
		
	}
	
}
