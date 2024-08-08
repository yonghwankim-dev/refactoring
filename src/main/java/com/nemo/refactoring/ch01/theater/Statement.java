package com.nemo.refactoring.ch01.theater;

import java.util.List;

public class Statement {
	private final String customer;
	private final List<EnrichPerformance> performances;
	private final int totalAmount;
	private final int totalVolumeCredits;

	public Statement(String customer, List<EnrichPerformance> performances) {
		this.customer = customer;
		this.performances = performances;
		this.totalAmount = totalAmount(performances);
		this.totalVolumeCredits = totalVolumeCredits(performances);
	}

	private int totalAmount(List<EnrichPerformance> performances) {
		return performances.stream()
			.map(EnrichPerformance::getAmount)
			.reduce(0, Integer::sum);
	}

	private int totalVolumeCredits(List<EnrichPerformance> performances) {
		return performances.stream()
			.map(EnrichPerformance::getVolumeCredits)
			.reduce(0, Integer::sum);
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
