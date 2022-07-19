package com.example.firstSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.awt.Color;
import java.util.Date;

@RestController
public class DemoController {
    @GetMapping("/")
    public String welcomeMessage(){
        return "Spring Boot!!!";
    }
    @GetMapping("/getdate")
    public Date getDate(){
        return new Date();
    }
}