package com.shoppinglist.shoppinglist.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shoppinglist {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;

	private String itemName;
	private long amount;

	public Shoppinglist() {
		super();

	}

	public Shoppinglist(String itemName, long amount) {
		super();
		this.itemName = itemName;
		this.amount = amount;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

}
