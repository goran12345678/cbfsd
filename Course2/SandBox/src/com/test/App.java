package com.test;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
	    
		System.out.println(getStudent(student));

	}

	public static String getStudent(Object o) {
		
		return o.toString();
	}
}
