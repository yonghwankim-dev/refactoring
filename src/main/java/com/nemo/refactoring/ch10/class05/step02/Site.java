package com.nemo.refactoring.ch10.class05.step02;

public class Site {
	private final Customer customer;

	public Site(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		return this.customer.getName().equals("미확인 고객") ? createUnknownCustomer() : this.customer;
	}

	private Customer createUnknownCustomer(){
		return new UnknownCustomer();
	}
}
