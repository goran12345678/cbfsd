package com.fullstack.springcloudfeignclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringcloudfeignclientdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudfeignclientdemoApplication.class, args);
	}

}
