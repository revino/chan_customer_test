package com.order.chanOrderSample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String Hi(){
        return "hi";
    }

    @GetMapping("/hello")
    public String Hello(){
        return "hello";
    }
}

