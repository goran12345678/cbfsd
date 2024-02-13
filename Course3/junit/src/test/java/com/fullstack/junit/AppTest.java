package com.fullstack.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import com.fullstack.junit.model.PromoCodes;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {

	PromoCodes promoCode;

	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */

	public AppTest() {
		promoCode = new PromoCodes();
	}

	/**
	 * @return the suite of tests being tested
	 */
	/*
	 * public static Test suite() { return new TestSuite( AppTest.class ); }
	 * 
	 *//**
		 * Rigourous Test :-)
		 *//*
			 * public void testApp() { assertTrue( true ); }
			 */

	@Test
	public void testTrue() {
		assertTrue(3 > 2);
	}

	@Test
	public void testEqual() {
		assertEquals(true, "Hi there".length() > 5);
	}

	@Test
	public void testCode() {
		assertEquals(true, promoCode.getDiscount("") == 0);
	}

	@Test
	public void timetoCalculateDicount() {
	assertTimeout(Duration.ofMinutes(13), ()-> {
			 promoCode.getLongProcess();
		});
	}
}
