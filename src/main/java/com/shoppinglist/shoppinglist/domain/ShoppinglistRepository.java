package com.shoppinglist.shoppinglist.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ShoppinglistRepository extends CrudRepository <Shoppinglist, Long> {

	List <Shoppinglist> findAll();
	
}
