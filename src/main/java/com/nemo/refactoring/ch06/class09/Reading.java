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

	public static double baseRate(int month, int year) {
		Map<Integer, double[]> baseMap = new HashMap(){{
			put(2024,  new double[]{0.1, 0.1, 0.12, 0.12, 0.15, 0.15, 0.18, 0.18, 0.2, 0.2, 0.22, 0.22});
			put(2024,  new double[]{0.1, 0.1, 0.12, 0.12, 0.15, 0.15, 0.18, 0.18, 0.2, 0.2, 0.22, 0.22});
		}};

		return baseMap.get(year)[month - 1];
	}
}
