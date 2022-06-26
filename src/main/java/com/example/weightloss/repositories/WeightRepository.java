package com.example.weightloss.repositories;

import com.example.weightloss.entities.Weight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeightRepository extends CrudRepository<Weight, Long> {
    List<Weight> findAll();
}
