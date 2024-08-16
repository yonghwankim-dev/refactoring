package com.nemo.refactoring.ch08.class02;

import java.time.LocalDate;

public class CustomerContract {
	private final LocalDate startDate;
	private double discountRate;
	public CustomerContract(LocalDate startDate, double discountRate) {
		this.startDate = startDate;
		this.discountRate = discountRate;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
