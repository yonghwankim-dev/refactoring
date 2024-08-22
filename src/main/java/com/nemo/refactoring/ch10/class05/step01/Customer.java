package com.nemo.refactoring.ch10.class05.step01;

import java.time.LocalDate;

public class Customer {
	private final String name;
	private BillingPlan billingPlan;
	private PaymentHistory paymentHistory;

	public Customer(String name) {
		this(name, new BillingPlan("basic"));
	}

	public Customer(String name, BillingPlan billingPlan) {
		this(name, billingPlan, null);
	}

	public Customer(String name, BillingPlan billingPlan, PaymentHistory paymentHistory) {
		this.name = name;
		this.billingPlan = billingPlan;
		this.paymentHistory = paymentHistory;
	}

	public BillingPlan billingPlan(){
		return billingPlan;
	}

	public PaymentHistory paymentHistory(){
		return paymentHistory;
	}

	public String getName() {
		return name;
	}

	public void setBillingPlan(BillingPlan billingPlan) {
		this.billingPlan = billingPlan;
	}
}
