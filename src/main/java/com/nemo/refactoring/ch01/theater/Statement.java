package com.nemo.refactoring.ch01.theater;

import java.util.List;

public class Statement {
	private final String customer;
	private final List<EnrichPerformance> performances;
	private final int totalAmount;
	private final int totalVolumeCredits;

	public Statement(String customer, List<EnrichPerformance> performances, int totalAmount, int totalVolumeCredits) {
		this.customer = customer;
		this.performances = performances;
		this.totalAmount = totalAmount;
		this.totalVolumeCredits = totalVolumeCredits;
	}

	public String getCustomer() {
		return customer;
	}

	public List<EnrichPerformance> getPerformances() {
		return performances;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public int getTotalVolumeCredits() {
		return totalVolumeCredits;
	}
}
