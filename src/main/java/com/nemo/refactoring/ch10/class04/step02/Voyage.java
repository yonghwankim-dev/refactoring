package com.nemo.refactoring.ch10.class04.step02;

public class Voyage {
	private String zone;
	private int length;
	private int profit;

	public Voyage(String zone, int length, int profit) {
		this.zone = zone;
		this.length = length;
		this.profit = profit;
	}

	public String getZone() {
		return zone;
	}

	public int getLength() {
		return length;
	}

	public int getProfit() {
		return profit;
	}
}
