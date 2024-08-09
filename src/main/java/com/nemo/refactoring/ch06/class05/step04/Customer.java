package com.nemo.refactoring.ch06.class05.step04;

public class Customer {
	private String name;
	private Address address;

	public Customer(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}
}
