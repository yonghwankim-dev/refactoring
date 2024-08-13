package com.nemo.refactoring.ch06.class11;

public class Order {
	public int priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
		int basePrice = product.getBasePrice() * quantity;
		int discount = (int)(Math.max(0, quantity - product.getDiscountThreshold()) * product.getBasePrice() * product.getDiscountRate());
		PriceData priceData = new PriceData(basePrice);
		return applyShipping(priceData, quantity, shippingMethod, basePrice, discount);
	}

	private int applyShipping(PriceData priceData, int basePrice, ShippingMethod shippingMethod, int quantity, int discount) {
		int shippingPerCase = (basePrice > shippingMethod.getDiscountThreshold()) ? shippingMethod.getDiscountFee() : shippingMethod.getFeePerCase();
		int shippingCost = quantity * shippingPerCase;
		return basePrice - discount + shippingCost;
	}

	public static void main(String[] args) {
		Order order = new Order();
		Product car = new Product(10_000_000, 0.1, 3);
		int quantity = 5;

		int discountThreshold = 500_000;
		int discountFee = 500_000;
		int feePerCase = 100_000;
		ShippingMethod shippingMethod = new ShippingMethod(discountThreshold, discountFee, feePerCase);
		int price = order.priceOrder(car, quantity, shippingMethod);
		System.out.println(price); // 50_500_000
	}
}
