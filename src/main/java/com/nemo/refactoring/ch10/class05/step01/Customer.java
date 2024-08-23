package com.nemo.refactoring.ch10.class05.step01;

public class Customer {
	private final String name;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Plan billingPlan() {
		return new Plan("요금제", 1000);
	}
}
