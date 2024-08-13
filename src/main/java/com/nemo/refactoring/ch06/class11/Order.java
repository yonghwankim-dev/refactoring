package com.nemo.refactoring.ch06.class11;

public class Order {
	public int priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
		int basePrice = product.getBasePrice() * quantity;
		int discount = (int)(Math.max(0, quantity - product.getDiscountThreshold()) * product.getBasePrice() * product.getDiscountRate());
		PriceData priceData = new PriceData(basePrice, quantity, discount);
		return applyShipping(priceData, shippingMethod);
	}

	private int applyShipping(PriceData priceData, ShippingMethod shippingMethod) {
		int shippingPerCase = (priceData.getBasePrice() > shippingMethod.getDiscountThreshold()) ? shippingMethod.getDiscountFee() : shippingMethod.getFeePerCase();
		int shippingCost = priceData.getQuantity() * shippingPerCase;
		return priceData.getBasePrice() - priceData.getDiscount() + shippingCost;
	}
}
