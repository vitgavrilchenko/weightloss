package com.example.weightloss.controllers;

import com.example.weightloss.entities.Weight;
import com.example.weightloss.services.WeightService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final WeightService weightService;

    @GetMapping("/test")
    public String getTestMessage() {
        return "hello. this is the test message";
    }

    @GetMapping("/weight-list")
    public List<Weight> getWeightList() {
        return weightService.getWeightList();
    }
    @PostMapping("/weight")
    public void addWeight(@RequestBody Weight weight) {
        weightService.addWeight(weight);
    }

}
