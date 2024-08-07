package com.nemo.refactoring.ch01.theater;

import java.util.List;

public class Invoice {
	private final String customer;
	private final List<Performance> performances;

	public Invoice(String customer, List<Performance> performances) {
		this.customer = customer;
		this.performances = performances;
	}
}
