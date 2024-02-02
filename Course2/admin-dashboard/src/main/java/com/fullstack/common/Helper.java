package com.fullstack.common;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fullstack.application.model.Batch;
import com.fullstack.application.model.Schedule;

public class Helper {
	
	public static void ScheduleBatch(String batchId, String date, String time, String duration) throws Exception {
		
		if(batchId == null || batchId == "") {
			//response with error
			throw new Exception("batchId was not provide");
		}
		//1. check if Batch is assigned to a Schedule
		Boolean isAssigned = false;
		if(isAssigned) {
			//change Schedule
		}else {
			//create new Schedule and assign Batch
		}
		
	}
	
	public static void AssignStudentToBatch(String studentId, String batchId) throws Exception {
		
		if(studentId == null || batchId == "") {
			//need Batch id
			throw new Exception("studentId or batchId was not provide");
		}
		//assign Student to Batch
	}
	
	public static String getJson(Schedule schedule) throws Exception {
		//Json Serialization
		ObjectMapper om = new ObjectMapper();
		String json;
		try {
			json = om.writeValueAsString(schedule);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			throw new Exception("failed to serialize Json object");
		}
		return json;
	}
	public static String getJson(List<Schedule> schedules) throws Exception {
		//Json Serialization
		ObjectMapper om = new ObjectMapper();
		String json;
		try {
			json = om.writeValueAsString(schedules);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			throw new Exception("failed to serialize Json object");
		}
		return json;
	}
	public static String getJson(Batch batch) throws Exception {
		//Json Serialization
		ObjectMapper om = new ObjectMapper();
		String json;
		try {
			json = om.writeValueAsString(batch);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			throw new Exception("failed to serialize Json object");
		}
		return json;
	}
	public static String getJson(List<Batch> batches) throws Exception {
		//Json Serialization
		ObjectMapper om = new ObjectMapper();
		String json;
		try {
			json = om.writeValueAsString(batches);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			throw new Exception("failed to serialize Json object");
		}
		return json;
	}

}
