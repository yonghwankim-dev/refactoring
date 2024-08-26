package com.nemo.refactoring.ch12;

public class Party {

	private final int monthlyCost;

	public Party(int monthlyCost) {
		this.monthlyCost = monthlyCost;
	}

	public int getAnnualCost() {
		return this.monthlyCost * 12;
	}
}
