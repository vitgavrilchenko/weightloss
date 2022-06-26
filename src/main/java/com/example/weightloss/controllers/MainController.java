package com.example.weightloss.controllers;

import com.example.weightloss.entities.Weight;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class MainController {

    @RequestMapping("/test")
    public String getTestMessage() {
        return "hello. this is  the test message";
    }

    @RequestMapping("/weight")
    public Weight getWeight() {
        Weight weight = new Weight();
        weight.setWeight("75.5");
        weight.setDateTime(LocalDateTime.now());
        return weight;
    }

}
