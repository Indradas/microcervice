package com.example.Service.A.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service-a")
public class ServiceAController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/call-service-b")
    public String callServiceB() {
        String serviceBResponse = restTemplate.getForObject("http://service-b/service-b/data", String.class);
        return "Response from Service B: " + serviceBResponse;
    }

//    @GetMapping("/call-service-c")
//    public String callServiceC() {
//        String serviceCResponse = restTemplate.getForObject("http://service-c/service-c/data", String.class);
//        return "Response from Service C: " + serviceCResponse;
//    }
}
