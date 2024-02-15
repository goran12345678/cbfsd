package com.fullstack.junit.model;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class PromoCodes {

	List<String> promoCodes;
	TreeMap<String, Double> promoCodesWithDiscount;

	public PromoCodes() {
		super();
		// TODO Auto-generated constructor stub
		promoCodes = Arrays.asList("JUMBO", "BINGO", "HAPPY50", "TRYNEW90", "SUNDAY");
		promoCodesWithDiscount = new TreeMap<String, Double>();
		promoCodesWithDiscount.put(promoCodes.get(0), 0.40);
		promoCodesWithDiscount.put(promoCodes.get(1), 0.20);
		promoCodesWithDiscount.put(promoCodes.get(2), 0.50);
		promoCodesWithDiscount.put(promoCodes.get(3), 0.90);
		promoCodesWithDiscount.put(promoCodes.get(4), 0.25);
	}
	
	public double getDiscount(String promoCode) {
		return (promoCodesWithDiscount.containsKey(promoCode)) ? promoCodesWithDiscount.get(promoCode) : 0; 
	}
	
	public void getLongProcess() throws InterruptedException {
		//while(true);
			Thread.sleep(15);
	}
	public boolean checkCode(String pcode) {
		return promoCodes.contains(pcode);
	}

	public List<String> getPromoCodes() {
		return promoCodes;
	}

	public TreeMap<String, Double> getPromoCodesWithDiscount() {
		return promoCodesWithDiscount;
	}

}
