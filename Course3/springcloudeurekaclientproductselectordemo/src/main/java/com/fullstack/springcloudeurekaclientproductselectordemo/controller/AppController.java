package com.fullstack.springcloudeurekaclientproductselectordemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

@RestController
@RequestMapping("/app")
public class AppController {
	
	@Autowired
	private EurekaClient eurekaClient;

	@GetMapping("/get")
	public String getProducts() {
		
		Application application = eurekaClient.getApplication("Product");
		InstanceInfo instanceInfo = application.getInstances().get(0);
		
		String url = "http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() + "/app/products";
		String response = new RestTemplate().getForObject(url, String.class);
		
		return response;
	}
}
