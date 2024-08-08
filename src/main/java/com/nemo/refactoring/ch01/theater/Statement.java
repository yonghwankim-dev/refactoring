package com.nemo.refactoring.ch01.theater;

import java.util.List;

public class Statement {
	private final String customer;
	private final List<Performance> performances;

	public Statement(String customer, List<Performance> performances) {
		this.customer = customer;
		this.performances = performances;
	}

	public String getCustomer() {
		return customer;
	}

	public List<Performance> getPerformances() {
		return performances;
	}
}
