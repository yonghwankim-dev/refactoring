package com.nemo.refactoring.ch10.class05.step02;

public class Site {
	private final Customer customer;

	public Site(Customer customer) {
		this.customer = customer;
	}

	public Object getCustomer() {
		return this.customer;
	}
}
