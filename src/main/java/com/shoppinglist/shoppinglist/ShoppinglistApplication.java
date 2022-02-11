package com.shoppinglist.shoppinglist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.shoppinglist.shoppinglist.domain.Shoppinglist;
import com.shoppinglist.shoppinglist.domain.ShoppinglistRepository;

@SpringBootApplication
public class ShoppinglistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppinglistApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner demo(ShoppinglistRepository repository) {
	return (args) -> {
		
		Shoppinglist first = new Shoppinglist("Tomatoes", 5);
		repository.save(first);
		
		
	};
	}
}
