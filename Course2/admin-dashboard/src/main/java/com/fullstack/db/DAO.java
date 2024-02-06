package com.fullstack.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fullstack.application.model.Batch;
import com.fullstack.application.model.Schedule;
import com.fullstack.application.model.Student;


/*
 * CREATE TABLE Student(
    id int primary key auto_increment,
    isActive bit,
    name varchar(256),
    email varchar(256),
    phone varchar(256),
    Date dob
 * )
 *
 
 CREATE Table BatchMap(
 id int primary key auto_increment,
 studentId int,
 batchId int
 
 )
 
 CREATE TABLE Schedule(
 id int primary key auto_increment,
 batch int foreign key,
 Date startDate,
 duration int
 )
 
  CREATE TABLE Batch(
 id int primary key auto_increment,
 maxCapcity int
 )
 
 */

public class DAO {

	public static void addBatch(Connection conn, Batch obj) throws Exception {

		String query = "INSERT INTO Batch VALUES(null,?)";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, obj.getMaxCapacity());
		int result = statement.executeUpdate();
		if(result == 0)
			throw new Exception("Failed to add Batch");

	}

	public static void editBatch(Connection conn, Batch obj) throws Exception {
		String query = "UPDATE Batch SET maxCapacity = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, obj.getMaxCapacity());
		int result = statement.executeUpdate();
		if(result == 0)
			throw new Exception("Failed to add Batch");
	}

	public static void deleteBatch(Connection conn, int id) throws Exception {
		String query = "DELETE FROM Batch WHERE id = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, id);
		int result = statement.executeUpdate();
		if(result == 0)
			throw new Exception("Failed to add Batch");

	}
	public static List<Batch> getBatch(Connection conn) throws Exception{
		List<Batch> result = new ArrayList<Batch>();
		
		String query = "SELECT * FROM Batch";
		PreparedStatement statement = conn.prepareStatement(query);
		ResultSet set = statement.executeQuery();
		while(set.next()) {
			int batchId = set.getInt("id");
			Batch batch = new Batch(batchId);
			batch.setMaxCapacity(set.getInt("maxCapcity"));
			
			String  squery = "SELECT b.id as batchId, b.maxCapacity, s.*  "
					+ "FROM Batch b INNER JOIN BatchMap bm ON b.id = bm.batchId "
					+ "INNER JOIN Student s ON s.id = bm.studentId WHERE b.id = ?";
			PreparedStatement sstatement = conn.prepareStatement(query);
			sstatement.setInt(1, batchId);
			ResultSet sset = statement.executeQuery();
			while(sset.next()) {
				int studentId = sset.getInt("id");
				Student s = new Student(studentId);
				s.setDob(sset.getDate("dob"));
				s.setEmail(sset.getString("email"));
				s.setIsActive(sset.getBoolean("isActive"));
				s.setName(sset.getString("name"));
				s.setPhone(sset.getString("phone"));
				batch.addStudent(s);
			}
			result.add(batch);
			
		}
		
		return result;
	}

	public static void addSchedule(Connection conn, Schedule obj) throws Exception {
		
		String query = "INSERT INTO Schedule VALUES(null,?,?,?)";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, (obj.getBatch() != null)? obj.getBatch().getId(): null);
		statement.setDate(2, obj.getStartDate());
		statement.setInt(3, obj.getDuration());
		int result = statement.executeUpdate();
		if(result == 0)
			throw new Exception("Failed to add Schedule");

	}

	public static void editSchedule(Connection conn, Schedule obj) throws Exception {
		String query = "UPDATE Schedule SET batchFK = ?, startDate = ?, duration = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, (obj.getBatch() != null)? obj.getBatch().getId(): null);
		statement.setDate(2, obj.getStartDate());
		statement.setInt(3, obj.getDuration());
		int result = statement.executeUpdate();
		if(result == 0)
			throw new Exception("Failed to add Schedule");

	}

	public static void deleteSchedule(Connection conn, int id) throws Exception {
		String query = "DELETE FROM Schedule WHERE id = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, id);
		int result = statement.executeUpdate();
		if(result == 0)
			throw new Exception("Failed to add Batch");
	}
	public static List<Schedule> getSchedule(Connection conn) throws Exception {
		List<Schedule> result = new ArrayList<Schedule>();
		String query = "SELECT * FROM Schedule";
		PreparedStatement statement = conn.prepareStatement(query);
		ResultSet set = statement.executeQuery();
		while(set.next()) {
			int scheduleId = set.getInt("id");
			Schedule s = new Schedule(scheduleId);
			
			String bquery = "SELECT * FROM Batch WHERE id = ?";
			PreparedStatement bstatement = conn.prepareStatement(query);
			bstatement.setInt(1, scheduleId);
			ResultSet bset = statement.executeQuery();
			bset.next();
			int batchId = bset.getInt("id");
			Batch batch = new Batch(batchId);
			batch.setMaxCapacity(bset.getInt("maxCapacity"));
			
			List<Student> students = getStudent(conn, batchId);
			for(Student student: students) {
				batch.addStudent(student);
			}

			s.setBatch(batch);
			
			result.add(s);
		}
		
		
		return result;
	}
	public static void addStudent(Connection conn, Student obj) throws Exception {
		
		String query = "INSERT INTO Student VALUES(null,?,?,?,?,?)";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setBoolean(1, obj.getIsActive());
		statement.setString(2, obj.getName());
		statement.setString(3, obj.getEmail());
		statement.setString(4, obj.getPhone());
		statement.setDate(5, obj.getDob());
		int result = statement.executeUpdate();
		if(result == 0)
			throw new Exception("Failed to add Student");

	}

	public static void editStudent(Connection conn, Student obj) throws Exception {
		String query = "UPDATE Student SET isActive = ?, name = ?, email = ?, phone = ?, dob = ? ";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setBoolean(1, obj.getIsActive());
		statement.setString(2, obj.getName());
		statement.setString(3, obj.getEmail());
		statement.setString(4, obj.getPhone());
		statement.setDate(5, obj.getDob());
		int result = statement.executeUpdate();
		if(result == 0)
			throw new Exception("Failed to add Student");

	}

	public static void deleteStudent(Connection conn, int id) throws Exception {
		String query = "DELETE FROM Student WHERE id = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, id);
		int result = statement.executeUpdate();
		if(result == 0)
			throw new Exception("Failed to add Batch");
	}
	public static List<Student> getStudent(Connection conn) throws Exception {
		List<Student> result = new ArrayList<Student>();
		String query = "SELECT * FROM Student";
		PreparedStatement statement = conn.prepareStatement(query);
		ResultSet set = statement.executeQuery();
		while(set.next()) {
			int studentId = set.getInt("id");
			Student s = new Student(studentId);
			s.setDob(set.getDate("dob"));
			s.setEmail(set.getString("email"));
			s.setIsActive(set.getBoolean("isActive"));
			s.setName(set.getString("name"));
			s.setPhone(set.getString("phone"));
			result.add(s);
		}
		
		return result;
	}
	public static List<Student> getStudent(Connection conn, int batchId) throws Exception {
		List<Student> result = new ArrayList<Student>();
		String  query = "SELECT b.id as batchId, b.maxCapacity, s.*  "
				+ "FROM Batch b INNER JOIN BatchMap bm ON b.id = bm.batchId "
				+ "INNER JOIN Student s ON s.id = bm.studentId WHERE b.id = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, batchId);
		ResultSet set = statement.executeQuery();
		while(set.next()) {
			int studentId = set.getInt("id");
			Student s = new Student(studentId);
			s.setDob(set.getDate("dob"));
			s.setEmail(set.getString("email"));
			s.setIsActive(set.getBoolean("isActive"));
			s.setName(set.getString("name"));
			s.setPhone(set.getString("phone"));
			result.add(s);
		}
		
		return result;
	}

	public static void assignStudentToBatch(Connection conn, int studentId, int batchId) throws Exception {
		String query = "INSERT BatchMap VALUES(null,?,?)";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, batchId);
		statement.setInt(2, studentId);
		int result = statement.executeUpdate();
		if(result == 0)
			throw new Exception("Failed to add Batch");
	}
	public static void scheduleBatch(Connection conn, int scheduleId, int batchId) throws Exception {
		String query = "UPDATE Schudule SET batchFK = ? WHERE id = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, batchId);
		statement.setInt(2, scheduleId);
		int result = statement.executeUpdate();
		if(result == 0)
			throw new Exception("Failed to add Batch");
	}

}
