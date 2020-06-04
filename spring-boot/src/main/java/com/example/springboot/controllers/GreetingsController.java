package com.example.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @RequestMapping("/")
    public String greetings(){
        return "Greetings from Spring Boot Application! Hope you are doing well.";
    }
}
