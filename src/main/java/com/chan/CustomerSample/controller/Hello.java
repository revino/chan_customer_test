package com.chan.CustomerSample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String Hi(){
        return "hi";
    }

    @GetMapping("/hi")
    public String HELLO(){
        return "hello customer";
    }

    @GetMapping("/checkHealth")
    public String checkHealth(){
        return "check health";
    }

}

