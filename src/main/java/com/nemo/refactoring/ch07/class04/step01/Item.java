package com.nemo.refactoring.ch07.class04.step01;

public class Item {
	private final String name;
	private final int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
