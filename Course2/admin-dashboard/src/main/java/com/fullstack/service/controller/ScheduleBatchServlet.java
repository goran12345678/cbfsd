package com.fullstack.service.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import com.fullstack.common.Helper;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScheduleBatchServlet
 */
public class ScheduleBatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScheduleBatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("batchId");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String duration = request.getParameter("duration");
				
		try {
			Helper.ScheduleBatch(id, date, time, duration);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
