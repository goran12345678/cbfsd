package com.zumbapro.common;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.zumbapro.db.DB;
import com.zumbapro.model.Batch;
import com.zumbapro.model.Student;

public class DbMethods {

	/*
	 * method returns all students in collection
	 */
	public static ArrayList<Student> getStudent() {

		ArrayList<Student> result = new ArrayList<Student>();

		try {
			DB db = new DB();

			String sql = "SELECT * FROM Student";

			PreparedStatement statement = db.getConnection().prepareStatement(sql);

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				Student s = new Student();
				s.setId(set.getString("id"));
				s.setAge(set.getString("age"));
				s.setEmail(set.getString("email"));
				s.setName(set.getString("name"));
				s.setPhone(set.getString("phone"));
				result.add(s);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	/*
	 * method returns one student in collection
	 */
	public static ArrayList<Student> getStudent(String id) {

		ArrayList<Student> result = new ArrayList<Student>();

		try {
			DB db = new DB();

			String sql = "SELECT * FROM Student WHERE id = ?";

			PreparedStatement statement = db.getConnection().prepareStatement(sql);
			statement.setString(1, id);

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				Student s = new Student();
				s.setId(set.getString("id"));
				s.setAge(set.getString("age"));
				s.setEmail(set.getString("email"));
				s.setName(set.getString("name"));
				s.setPhone(set.getString("phone"));
				result.add(s);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	public static int addStudent(Student s) {
		int result = 0;
		try {

			DB db = new DB();

			String sql = "INSERT INTO Student VALUES(null,?,?,?,?)";

			PreparedStatement statement = db.getConnection().prepareStatement(sql);
			statement.setString(1, s.getName());
			statement.setString(2, s.getEmail());
			statement.setString(3, s.getPhone());
			statement.setString(4, s.getAge());
			result = db.executeUpdate(statement);

			db.closeConnection();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public static int editStudent(Student s) {
		int result = 0;
		try {

			DB db = new DB();

			String sql = "UPDATE Student SET name = ?, email = ?, phone = ?, age = ?";

			PreparedStatement statement = db.getConnection().prepareStatement(sql);
			statement.setString(1, s.getName());
			statement.setString(2, s.getEmail());
			statement.setString(3, s.getPhone());
			statement.setString(4, s.getAge());
			result = db.executeUpdate(statement);

			db.closeConnection();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public static ArrayList<Batch> getBatch() {

		ArrayList<Batch> result = new ArrayList<Batch>();

		try {
			DB db = new DB();

			String sql = "SELECT * FROM Batch";

			PreparedStatement statement = db.getConnection().prepareStatement(sql);

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				Batch s = new Batch();
				s.setDuration(set.getString("duration"));
				s.setId(set.getString("id"));
				s.setMaxCapacity(Integer.parseInt(set.getString("maxCapacity")));
				s.setStartDate(set.getString("startDate"));
				s.setStartTime(set.getString("startTime"));
				result.add(s);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	public static ArrayList<Batch> getBatch(String id) {

		ArrayList<Batch> result = new ArrayList<Batch>();

		try {
			DB db = new DB();

			String sql = "SELECT * FROM Batch WHERE id = ?";

			PreparedStatement statement = db.getConnection().prepareStatement(sql);
			statement.setString(1, id);

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				Batch s = new Batch();
				s.setDuration(set.getString("duration"));
				s.setId(set.getString("id"));
				s.setMaxCapacity(Integer.parseInt(set.getString("maxCapacity")));
				s.setStartDate(set.getString("startDate"));
				s.setStartTime(set.getString("startTime"));
				result.add(s);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}
	public static int editBatch(Batch b) {
		int result = 0;
		try {

			DB db = new DB();

			String sql = "UPDATE Batch SET duration = ?, maxCapacity = ?, startDate = ?,startTime = ?";

			PreparedStatement statement = db.getConnection().prepareStatement(sql);
			statement.setString(1, b.getDuration());
			statement.setString(2, String.valueOf(b.getMaxCapacity()));
			statement.setString(3, b.getStartDate());
			statement.setString(4, b.getStartTime());
			result = db.executeUpdate(statement);

			db.closeConnection();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
