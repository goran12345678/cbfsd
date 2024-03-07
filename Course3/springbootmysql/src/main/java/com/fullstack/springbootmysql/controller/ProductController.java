package com.fullstack.springbootmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.springbootmysql.model.Product;
import com.fullstack.springbootmysql.model.Response;
import com.fullstack.springbootmysql.repository.ProductRepository;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

	@Autowired
	ProductRepository respository;
	
	@PostMapping("/add")
	public ResponseEntity<Response> addProduct(@RequestParam String name, @RequestParam String brandName, @RequestParam Integer price ) {
		
		Product product = new Product(null, name, brandName, price);
		System.out.println("Product: " + product);
		
		try {
			respository.save(product);
			Response response = new Response(701, "Product " + name +" Save Successfully");
			return new ResponseEntity<Response>(response, HttpStatus.OK);
		}catch(Exception e) {
			Response response = new Response(701, "Product " + name +" Not Save Successfully. Exception: " + e.getMessage());
			return new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		
	}
	
}
