package com.presidium.decisionservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomNumberController {

    @GetMapping("/random")
    public Integer getRandomNumber(){
        return new Random().nextInt(100);
    }

    @GetMapping("/")
    public String hello(){
        return "Hello there";
    }

}
