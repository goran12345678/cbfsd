package com.fullstack.springbootmongodatabase.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.springbootmongodatabase.model.Address;
import com.fullstack.springbootmongodatabase.model.Response;
import com.fullstack.springbootmongodatabase.model.User;
import com.fullstack.springbootmongodatabase.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@PostMapping("/add")
	public ResponseEntity<Response> addUser(@RequestParam String name, @RequestParam String phone, @RequestParam String email,
			@RequestParam String adrsLine, @RequestParam String suiteNum, @RequestParam String city, @RequestParam String state,
			@RequestParam Integer zipCode){
		
		List<User> users = null;
		try {
			
			Address address = new Address(adrsLine, suiteNum, city, state, zipCode);
			User user = new User(null, name, phone, email, address);
			
			repository.save(user);
			
			users = new ArrayList<User>();
			users.add(user);
			Response response = new Response(101, " User " + name + " Saved Successfully at ", users);
			
			return new ResponseEntity<Response>(response, HttpStatus.INSUFFICIENT_STORAGE);
			
			
		}catch(Exception e) {
			Response response = new Response(301, "Ooops! Something Went Wrong: " + e.getMessage(), users);
			return new ResponseEntity<Response>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
