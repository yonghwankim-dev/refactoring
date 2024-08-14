package com.nemo.refactoring.ch07.class04.step01;

public class Order {
	private final Item item;
	private final int quantity;

	public Order(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public int price(){
		int basePrice = this.quantity * this.item.getPrice();
		double discountFactor = 0.98;
		if (basePrice > 1000){
			discountFactor -= 0.03;
		}
		return (int)(basePrice * discountFactor);
	}
}
