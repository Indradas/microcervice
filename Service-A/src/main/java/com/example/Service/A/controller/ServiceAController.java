package com.example.Service.A.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceAController {

    @GetMapping("/api/serviceA")
    public String getServiceAInfo() {
        return "Service A Response";
    }

    @Autowired
    private RestTemplate restTemplate;
    public String CallServiceB(){
        String response=restTemplate.getForObject("http://ServiceB/data",String.class);
        return response+"Service B";
    }
}