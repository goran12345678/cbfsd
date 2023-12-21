package com.learning.wrapper;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Person person = new Person();
		//person.toString();
		//System.out.println(person.toString());
		
		//float float_num = 100f;
		Float float_num = new Float(100.55);
		//System.out.println(float_num.toString());
		
		Integer int_wrapper = Integer.valueOf("130");
		System.out.println(int_wrapper * 2);
		
		//anonymous class
		/*Person person = new Person() {
			void setHairColor(String color) {
			
			}
		};*/
			
	}
	
	//encapsulation by inner class
	/*
	private class Person{
		private String eyeColor;
		private int height;
		private String hairColor;
		
		void setHairColor(String color) {
			this.hairColor = color;
		}
	}*/
 
}
//encapsulation

class Person {
	
	private String eyeColor;
	private int height;
	private String hairColor;
	
	void setHairColor(String color) {
		this.hairColor = color;
	}
	@Override
	public String toString() {
		return "Hello all";
	}
}

