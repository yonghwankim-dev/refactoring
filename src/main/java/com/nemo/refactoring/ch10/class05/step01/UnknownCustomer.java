package com.nemo.refactoring.ch10.class05.step01;

public class UnknownCustomer{

	public String getName() {
		return "거주자";
	}

	public boolean isUnknown() {
		return true;
	}

	public Plan billingPlan() {
		return new Plan("basic", 100);
	}

	public void setBillingPlan(Plan plan){
		// this code is ignored
	}

	public PaymentHistory getPaymentHistory() {
		return new NullPaymentHistory(false, 0);
	}
}
