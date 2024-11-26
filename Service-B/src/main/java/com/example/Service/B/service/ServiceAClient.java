package com.example.Service.B.service;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serviceA")
public interface ServiceAClient {

    @GetMapping("/api/serviceA")
    String getServiceAInfo();
}