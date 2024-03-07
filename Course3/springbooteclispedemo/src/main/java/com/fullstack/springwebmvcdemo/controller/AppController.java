package com.fullstack.springwebmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fullstack.springwebmvcdemo.model.Car;

@Controller
public class AppController {
	
	@GetMapping("/welcome")
	public String welcomeHome(@ModelAttribute("car") Car car) {
		System.out.println("[AppController] welcome requested");
		car.setMsg("Hello world");
		
		return "welcome";
	}
}
