package com.example.weightloss.controllers;

import com.example.weightloss.entities.Weight;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class MainController {

    @RequestMapping("/test")
    public String getTestMessage() {
        return "hello. this is  the test message";
    }

    @RequestMapping("/weight-list")
    public List<Weight> getWeightList() {
        Weight weight1 = new Weight();
        weight1.setWeight("75.5");
        weight1.setDateTime(LocalDate.of(2022, 6, 26));
        Weight weight2 = new Weight();
        weight2.setWeight("73.4");
        weight2.setDateTime(LocalDate.of(2022, 6, 25));

        return List.of(weight1, weight2, new Weight());
    }

}
