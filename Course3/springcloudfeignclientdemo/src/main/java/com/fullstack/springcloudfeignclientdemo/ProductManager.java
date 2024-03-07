package com.fullstack.springcloudfeignclientdemo;

import java.util.ArrayList;

import com.fullstack.springcloudfeignclientdemo.model.Product;

public class ProductManager implements ProductService {

	@Override
	public ArrayList<Product> getproducts() {
		// TODO Auto-generated method stub
		ArrayList<Product> products = new ArrayList<Product>();
		
		Product p1 = new Product("Nike Shoes", 200);
		Product p2 = new Product("Bicycle", 300);
		products.add(p1);
		products.add(p2);
		
		return null;
	}

}
