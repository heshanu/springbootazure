package com.example.azure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
