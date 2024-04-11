package com.jenkins.jenkinsawsdemo;

import java.util.HashMap;

public class CabFareUtil {
	
	HashMap<Integer, Integer> baseFares = new HashMap<Integer, Integer>();
	public CabFareUtil() {
		baseFares.put(5,100);
		baseFares.put(10,150);
		baseFares.put(15,200);
		baseFares.put(20,220);
	}
	
	public double calculateCabFare(double amount, int distance){
		int baseFare = baseFares.get(distance);
		amount = amount + baseFare + 0.18 * amount;
		return amount;
	}

}
