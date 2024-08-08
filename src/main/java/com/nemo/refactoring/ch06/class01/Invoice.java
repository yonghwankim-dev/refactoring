package com.nemo.refactoring.ch06.class01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class Invoice {

	private final String customer;
	private final List<Order> orders;
	private final LocalDate dueDate;

	public Invoice(String customer, List<Order> orders, LocalDate dueDate) {
		this.customer = customer;
		this.orders = orders;
		this.dueDate = dueDate;
	}

	public String getCustomer() {
		return customer;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}
}
