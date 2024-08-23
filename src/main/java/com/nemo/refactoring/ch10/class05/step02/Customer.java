package com.nemo.refactoring.ch10.class05.step02;

public class Customer {
	private final boolean isUnknown;
	private final String name;
	private Plan plan;
	private PaymentHistory paymentHistory;

	public Customer(boolean isUnknown, String name, Plan plan, PaymentHistory paymentHistory) {
		this.isUnknown = isUnknown;
		this.name = name;
		this.plan = plan;
		this.paymentHistory = paymentHistory;
	}

	public boolean isUnknown() {
		return isUnknown;
	}

	public String getName() {
		return name;
	}

	public Plan getBillingPlan() {
		return this.plan;
	}

	public void setBillingPlan(Plan plan) {
		this.plan = plan;
	}

	public PaymentHistory getPaymentHistory() {
		return paymentHistory;
	}
}
