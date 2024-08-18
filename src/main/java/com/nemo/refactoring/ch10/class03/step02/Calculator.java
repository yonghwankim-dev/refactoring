package com.nemo.refactoring.ch10.class03.step02;

public class Calculator {

	public double adjustedCapital(Instrument instrument) {
		double result = 0.0;
		if (instrument.getCapital() > 0.0) {
			if (instrument.getInterestRate() > 0 && instrument.getDuration() > 0) {
				result = ((double)instrument.getIncome() / instrument.getDuration()) * instrument.getAdjustmentFactor();
			}
		}
		return result;
	}
}
