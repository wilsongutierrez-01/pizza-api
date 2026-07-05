package com.pizza_jpa.pizza_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PizzaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaApiApplication.class, args);
	}

}
