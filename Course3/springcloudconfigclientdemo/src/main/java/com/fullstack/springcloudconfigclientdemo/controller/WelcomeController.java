package com.fullstack.springcloudconfigclientdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

	@Value("${app.name}")
	String appName;
	@Value("${app.welcome}")
	String appWelcomeMessage;
	
	@Value("${db.connection.string}")
	String dbConnectionUrl;
	@Value("${db.connection.username}")
	String dbConnectionUser;
	@Value("${db.connection.password}")
	String dbConnectionPwd;
	
	@GetMapping("/user")
	public String welcomeUser() {
		return appWelcomeMessage + " to " + appName;
	}
}

