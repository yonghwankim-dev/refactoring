package com.nemo.refactoring.ch06.class10;

public class EnrichReading {
	private double baseCharge;
	private double taxableCharge;

	public EnrichReading(double baseCharge, double taxableCharge) {
		this.baseCharge = baseCharge;
		this.taxableCharge = taxableCharge;
	}

	public double getBaseCharge() {
		return baseCharge;
	}

	public double getTaxableCharge() {
		return taxableCharge;
	}
}
