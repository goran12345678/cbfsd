package com.jenkins.jenkinsawsdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	CabFareUtil util = new CabFareUtil();
	
	@Test
	public void testCabFare() {
		double expected = 690.0;
		double actual = util.calculateCabFare(500, 5);
		assertEquals(expected, actual);
	}
	@Test
	public void testBaseFare() {
		int expected = 200;
		int actual = util.baseFares.get(15);
		assertEquals(expected, actual);
	}
}
