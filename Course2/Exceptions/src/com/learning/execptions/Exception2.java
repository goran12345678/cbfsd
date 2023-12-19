package com.learning.execptions;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int math = 3 / 0;

			/*
			 * catch(ArithmeticException err) {
			 * System.out.println("Arithmetic error occurred"); }
			 */
		} catch (Exception err) {
			System.out.println("Arithmetic error occurred " + err.getMessage());
		
		} finally {
			System.out.println("finally block");
		}

	}

}
