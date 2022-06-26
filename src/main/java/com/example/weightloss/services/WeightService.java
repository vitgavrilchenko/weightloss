package com.example.weightloss.services;

import com.example.weightloss.entities.Weight;
import com.example.weightloss.repositories.WeightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WeightService {
    private final WeightRepository weightRepository;
    public List<Weight> getWeightList() {

        return weightRepository.findAll();
    }

    public void addWeight(Weight weight) {
        if (weight.getDateTime() == null) {
            weight.setDateTime(LocalDate.now());
        }
        weightRepository.save(weight);
    }
}
