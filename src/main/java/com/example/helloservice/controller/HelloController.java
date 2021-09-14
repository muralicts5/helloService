package com.example.helloservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import feign.Request.HttpMethod;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private OrderService orderService;
	
	//@Autowired
	//private EurekaClient client;
	
	@GetMapping
	public String sayHello() {
		/*InstanceInfo instance=client.getNextServerFromEureka("ORDERSERVICE", false);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response=restTemplate.getForEntity(instance.getHomePageUrl()+"/orders", 
									String.class);
		String body=response.getBody();
		return body+" from Orderservice";*/

		// 10 lines
		// 5 lines
		// declare your req
		// Feign -> decl
		// feign --> starter
		System.out.println("orderService.sayHello():"+orderService.sayHello());
		
		return orderService.sayHello();
	//		return orderService.getPosts();
	}
	
	@PostMapping("/postdata")
	public Greeting sayHello12(@RequestBody Greeting greeting) {
		greeting.setMessage("Hi msg");
		return greeting;
	}
}
