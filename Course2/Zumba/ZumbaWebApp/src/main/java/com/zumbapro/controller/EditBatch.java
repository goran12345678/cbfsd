package com.zumbapro.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditBatch
 */
public class EditBatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditBatch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String name = request.getParameter("batName");
		String date = request.getParameter("batDate");
		String time = request.getParameter("batTime");
		String duration = request.getParameter("batDuration");
		String max = request.getParameter("batMaxCapacity");
		
		if(id != "") {
			//edit specific batch
			System.out.println("Edit batch id " + id);
		}else {
			//add new batch
			System.out.println("Add new batch " + name);
		}
	}

}
