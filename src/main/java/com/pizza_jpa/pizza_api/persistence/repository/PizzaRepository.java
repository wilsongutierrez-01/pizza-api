package com.pizza_jpa.pizza_api.persistence.repository;

import com.pizza_jpa.pizza_api.persistence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {
}
