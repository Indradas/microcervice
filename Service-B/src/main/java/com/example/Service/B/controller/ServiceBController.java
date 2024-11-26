package com.example.Service.B.controller;


import com.example.serviceB.client.ServiceAClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @Autowired
    private ServiceAClient serviceAClient;

    @GetMapping("/api/serviceB")
    public String getServiceBInfo() {
        // Call Service A using Feign Client
        String serviceAResponse = serviceAClient.getServiceAInfo();
        return "Service B Response + " + serviceAResponse;
    }
}