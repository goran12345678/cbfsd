package com.fullstack.user.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fullstack.user.model.Schedule;
import com.fullstack.user.model.Student;

public class DAO {

	public static void addStudent(Connection conn, Student s) throws Exception {

		String query = "INSERT INTO Student VALUES(null,?,?,?,?,?)";

		PreparedStatement statement = conn.prepareStatement(query);
		statement.setBoolean(1, s.getIsActive());
		statement.setString(2, s.getName());
		statement.setString(3, s.getEmail());
		statement.setString(4, s.getPhone());
		statement.setDate(5, s.getDob());

		int result = statement.executeUpdate();

		if (result == 0) {
			throw new Exception("Failed to add student " + s.getEmail());
		}

	}
	
	public static List<Schedule> getAvailableSchedule(Connection conn) throws Exception{
		List<Schedule> result = new ArrayList<Schedule>();
		
		String query = "SELECT s.id,s.startDate, s.duration,st.id, b.maxCapacity  From Schedule s INNER JOIN "
				+ "Batch b ON s.batchId = b.id INNER JOIN BatchMap bm ON b.id = bm.batchId "
				+ "INNER JOIN Student st ON st.id = bm.studentId "
				+ "GROUP BY st.id, s.id, s.startDate, s.duration, b.maxCapacity HAVING COUNT(st.id) <= b.maxCpacity";
		
		PreparedStatement statement = conn.prepareStatement(query);
		
		ResultSet set = statement.executeQuery();
		while(set.next()) {
			Schedule schedule = new Schedule(set.getInt("id"));
			schedule.setDuration(set.getInt("duration"));
			schedule.setStartDate(set.getDate("startDate"));
			result.add(schedule);
		}
		
		
		return result;
	}
	
	public static void assignStudentToSchedule(Connection conn, int studendtId, String scheduleIds) throws Exception {
		
	    List<Schedule> schedules = new ArrayList<Schedule>();
	    
	    List<Schedule> fullSchedules = new ArrayList<Schedule>();
	    
	    String query = "SELECT * FROM Schedule WHERE id IN(?)";
	    PreparedStatement statement = conn.prepareStatement(query);
	    statement.setString(1, scheduleIds);
	    
	    ResultSet set = statement.executeQuery();
	    while(set.next()) {
	    	
	    }
	    
	    for(Schedule schedule: schedules) {

	    	// check if a batch is assigned, if not create a new batch
	    	//check if student can be added to batch
	    	// if yes 
	    	// add this student to schedule batch
	    	// update the database
	    	//if no add to fullSchedules
	    	// 
	    	
	    }
	    for(Schedule schedule: fullSchedules){
	    	//notify student that these are full
	    	
	    }
		
		
	}

}
