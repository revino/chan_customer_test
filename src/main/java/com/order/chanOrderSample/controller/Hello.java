package com.order.chanOrderSample.controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String Hi(){
        return "hi hi";
    }

    @GetMapping("/hello")
    public String Hello(){
        return "hello";
    }
}

