package com.fullstack.user.model;

import java.util.ArrayList;
import java.util.List;

public class Batch {
	int id;
	int maxCapacity;
	List<Student> students;

	public Batch() {
		students = new ArrayList<Student>();
	}

	public Batch(int id) {
		this.id = id;
		students = new ArrayList<Student>();
		
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void addStudent(Student s) {

	}

	public void removeStudent(Student s) {

	}

}
