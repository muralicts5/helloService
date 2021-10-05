package com.example.helloservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import com.netflix.appinfo.InstanceInfo;
//import com.netflix.discovery.EurekaClient;

import feign.Request.HttpMethod;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private HiService hiservice;
	

	
	//@Autowired
	//private EurekaClient client;
	
	@GetMapping
	public String sayHello(@RequestHeader("Authorization") String token) {
			System.out.println("orderService.sayHello():"+hiservice.sayHello(token));
		return hiservice.sayHello(token);
	}
	
	
	
	@PostMapping("/postdata")
	public Greeting sayHello12(@RequestBody Greeting greeting) {
		greeting.setMessage("Hi msg");
		return greeting;
	}
}
