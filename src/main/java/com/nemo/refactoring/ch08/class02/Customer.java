package com.nemo.refactoring.ch08.class02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

public class Customer {
	private String name;
	private double discountRate;
	private CustomerContract contract;

	public Customer(String name, double discountRate) {
		this.name = name;
		this.setDiscountRate(discountRate);
		this.contract = new CustomerContract(dateToday());
	}

	public void becomePreferred() {
		this.setDiscountRate(discountRate + 0.03);
		// other anything
	}

	public int applyDiscount(int amount) {
		return amount - (int)(amount * this.discountRate);
	}

	private LocalDate dateToday() {
		return LocalDate.now();
	}

	private void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
