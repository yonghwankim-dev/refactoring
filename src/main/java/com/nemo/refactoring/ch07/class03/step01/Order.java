package com.nemo.refactoring.ch07.class03.step01;

public class Order {
	private final Long id;
	private final String priority;

	public Order(Long id, String priority) {
		this.id = id;
		this.priority = priority;
	}

	public Long getId() {
		return id;
	}

	public String getPriority() {
		return priority;
	}
}
