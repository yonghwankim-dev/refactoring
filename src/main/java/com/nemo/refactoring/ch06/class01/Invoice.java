package com.nemo.refactoring.ch06.class01;

import java.util.List;


public class Invoice {

	private final String customer;
	private final List<Order> orders;

	public Invoice(String customer, List<Order> orders) {
		this.customer = customer;
		this.orders = orders;
	}

	public String getCustomer() {
		return customer;
	}

	public List<Order> getOrders() {
		return orders;
	}
}
