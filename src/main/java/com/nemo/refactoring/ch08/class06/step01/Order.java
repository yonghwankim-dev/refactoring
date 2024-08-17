package com.nemo.refactoring.ch08.class06.step01;

import java.util.List;

public class Order {
	private final int units;

	public Order(int units) {
		this.units = units;
	}

	public int getUnits() {
		return units;
	}

	public boolean isRepeat() {
		return true;
	}
}
