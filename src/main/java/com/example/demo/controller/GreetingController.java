package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class GreetingController {

    @GetMapping("/")
    public String home() {
        return "Application is running";
    }
}
