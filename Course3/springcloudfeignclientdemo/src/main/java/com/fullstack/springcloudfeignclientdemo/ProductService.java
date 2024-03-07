package com.fullstack.springcloudfeignclientdemo;

import java.util.ArrayList;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.fullstack.springcloudfeignclientdemo.model.Product;

@FeignClient(url="http://localhost:9292")
public interface ProductService {

	@GetMapping("/products")
	ArrayList<Product> getProducts();
}
