package com.nemo.refactoring.ch10.class05.step01;

public class Site {
	private Customer customer;

	public Site(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}
}
