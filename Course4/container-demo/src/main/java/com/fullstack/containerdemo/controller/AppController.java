package com.fullstack.containerdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.containerdemo.model.Product;
import com.fullstack.containerdemo.model.Response;

@RestController
public class AppController {

	@GetMapping("/welcome")
	public String welcome() {
		return "<h3>Welcome to the WS</h3>";
	}
	@GetMapping("/products")
	public Response getProducts() {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product("iPhone", 1000));
		productList.add(new Product("MacBook", 3000));
		productList.add(new Product("Watch", 200));
		
		Response response = new Response(101, "Products fetched successfully", productList);
		
		return response;
	}
}
