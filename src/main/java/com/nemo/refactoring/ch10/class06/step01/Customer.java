package com.nemo.refactoring.ch10.class06.step01;

public class Customer {

	private final double discountRate;

	public Customer(double discountRate) {
		this.discountRate = discountRate;
	}

	public int applyDiscount(int price){
		if (this.discountRate <= 0){
			return price;
		}
		return (int)(price - (price * this.discountRate));
	}
}
