package com.fullstack.service.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import com.fullstack.common.Helper;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AssignStudentToBatchServlet
 */
public class AssignStudentToBatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignStudentToBatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String studentId = request.getParameter("studentId");
		String batchId = request.getParameter("batchId");
		
		try {
			Helper.AssignStudentToBatch(studentId, batchId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
