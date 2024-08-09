package com.nemo.refactoring.ch06.class10;

import java.util.HashMap;
import java.util.Map;

public class Reading {
	private String customer;
	private int quantity;
	private int month;
	private int year;

	public Reading(String customer, int quantity, int month, int year) {
		this.customer = customer;
		this.quantity = quantity;
		this.month = month;
		this.year = year;
	}

	public double baseCharge() {
		return baseRate() * quantity;
	}

	private double baseRate() {
		Map<Integer, double[]> baseMap = new HashMap<>();
		baseMap.put(2023,  new double[]{0.1, 0.1, 0.12, 0.12, 0.15, 0.15, 0.18, 0.18, 0.2, 0.2, 0.22, 0.22});
		baseMap.put(2024,  new double[]{0.1, 0.1, 0.12, 0.12, 0.15, 0.15, 0.18, 0.18, 0.2, 0.2, 0.22, 0.22});

		return baseMap.get(year)[month - 1];
	}

}
