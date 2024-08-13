package com.nemo.refactoring.ch06.class11.step03;


public class Order {
	private Long id;
	private String status;

	private Order() {
	}

	public Order(Long id, String status) {
		this.id = id;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}
}
