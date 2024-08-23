package com.nemo.refactoring.ch10.class05.step01;

public class Site {
	private final Customer customer;

	public Site(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer.getName().equals("미확인 고객") ? new UnknownCustomer("거주자", new Plan("basic", 100), null) : this.customer;
	}
}
