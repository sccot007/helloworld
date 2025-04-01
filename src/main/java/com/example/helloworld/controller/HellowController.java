package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
