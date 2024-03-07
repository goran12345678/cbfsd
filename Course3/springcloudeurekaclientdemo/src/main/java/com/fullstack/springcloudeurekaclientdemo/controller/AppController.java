package com.fullstack.springcloudeurekaclientdemo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.springcloudeurekaclientdemo.model.Product;
import com.fullstack.springcloudeurekaclientdemo.model.Response;

@RestController
@RequestMapping("/app")
public class AppController {

	@GetMapping("/products")
	public Response getProducts() {
		
		Product p1  = new Product("Apple iPhone",1300);
		Product p2 = new Product("Samsing LED TV", 500);
		Product p3 = new Product("Avia Water Bottle", 25);
		Product p4 = new Product("Apple Watch", 200);
		Product p5 = new Product("Apple MacBook", 2000);
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		Response response = new Response(101, "Products Fetched Successfully", products);
		
		return response;
	}
}
