package com.fullstack.service.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fullstack.application.model.Batch;
import com.fullstack.application.model.Schedule;
import com.fullstack.common.Helper;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetScheduleServlet
 */
public class GetScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetScheduleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/json");
		PrintWriter writer = response.getWriter();
		
		String id = request.getParameter("id");
		if(id != null) {
			//return specific Schedule
			
			Schedule schedule = null;
			try {
				String json = Helper.getJson(schedule);
				writer.print(json);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			//return all Schedules
			
			List<Schedule> schedules = null;
			try {
				String json = Helper.getJson(schedules);
				writer.print(json);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
