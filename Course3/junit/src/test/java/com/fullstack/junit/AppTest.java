package com.fullstack.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

import com.fullstack.junit.model.PromoCodes;


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
	public void testTime() {
	
	//assertTimeout(Duration.ofMillis(13), ()-> { promoCode.getLongProcess();});
	
	//assertEquals(false, 3 > 5);
	
	///assertEquals(false,promoCode.checkCode("JUMBO"));
	
	//assertNotNull(promoCode.getPromoCodes());
	
	//assertArrayEquals(promoCode.getPromoCodes().toArray(), Arrays.asList(1, 2, 3, 4, 5).toArray()); //compares length of array, data type in array, and value of each item.
	
	//PromoCodes pc = promoCode;
	//assertSame(promoCode, pc);
	
	//assertInstanceOf(List.class, promoCode.getPromoCodesWithDiscount());

		
	}
}
