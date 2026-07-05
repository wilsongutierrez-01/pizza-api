package com.pizza_jpa.pizza_api.service;

import com.pizza_jpa.pizza_api.persistence.entity.PizzaEntity;
import com.pizza_jpa.pizza_api.persistence.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<PizzaEntity> getAll() {
        return this.pizzaRepository.findAll();
    }

    public PizzaEntity getOne(int id) {
        return this.pizzaRepository.findById(id).orElse(null);
    }
}
