package com.nemo.refactoring.ch06.class11;


public class PriceData {
	private final int basePrice;
	private final int quantity;

	public PriceData(int basePrice, int quantity) {
		this.basePrice = basePrice;
		this.quantity = quantity;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public int getQuantity() {
		return quantity;
	}
}
