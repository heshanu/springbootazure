package com.example.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/house")
public class homeController {
    @GetMapping("/")
    public String home() {
        return "Hello from Azure App Service (in the staging slot)!";
    }
}
