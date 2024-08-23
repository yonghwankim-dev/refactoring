package com.nemo.refactoring.ch10.class05.step01;

public class UnknownCustomer extends Customer{

	public UnknownCustomer(String name, Plan plan, PaymentHistory paymentHistory) {
		super(name, plan, paymentHistory);
	}

	@Override
	public boolean isUnknown() {
		return true;
	}
}
