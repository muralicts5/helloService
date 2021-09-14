package com.example.helloservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ORDERSERVICE")
public interface OrderService {

    @RequestMapping(method = RequestMethod.GET, value = "/orders")
    String sayHello();

  
}
