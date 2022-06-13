package com.chan.CustomerSample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hi")
    public String Hi(){
        return "hi customer";
    }

    @GetMapping("/checkHealth")
    public String checkHealth(){
        return "check health";
    }

}

