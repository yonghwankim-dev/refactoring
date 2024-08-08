package com.nemo.refactoring.ch06.class01;

import java.util.List;


public class Invoice {

	private final List<Order> orders;

	public Invoice(List<Order> orders) {
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return orders;
	}
}
