package com.example.helloservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "HiService", url = "http://localhost:8200")
public interface HiService {

    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    String sayHello(@RequestHeader("Authorization") String token);

  
}
