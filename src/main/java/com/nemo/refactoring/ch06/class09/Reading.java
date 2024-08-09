package com.nemo.refactoring.ch06.class09;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Reading {
	private String customer;
	private int quantity;
	private LocalDate time;

	public Reading(String customer, int quantity, LocalDate time) {
		this.customer = customer;
		this.quantity = quantity;
		this.time = time;
	}

	public String getCustomer() {
		return customer;
	}

	public int getQuantity() {
		return quantity;
	}

	public LocalDate getTime() {
		return time;
	}

	public double calculateBaseCharge() {
		return baseRate() * quantity;
	}

	public double baseRate() {
		Map<Integer, double[]> baseMap = new HashMap<>();
		baseMap.put(2023,  new double[]{0.1, 0.1, 0.12, 0.12, 0.15, 0.15, 0.18, 0.18, 0.2, 0.2, 0.22, 0.22});
		baseMap.put(2024,  new double[]{0.1, 0.1, 0.12, 0.12, 0.15, 0.15, 0.18, 0.18, 0.2, 0.2, 0.22, 0.22});

		return baseMap.get(time.getYear())[time.getMonthValue() - 1];
	}

	public static double taxThreshold(int year) {
		Map<Integer, Double> taxMap = new HashMap(){{
			put(2023, 0.2);
			put(2024, 0.2);
		}};
		return taxMap.getOrDefault(year, 0.0);
	}
}
