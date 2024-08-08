package com.nemo.refactoring.ch01.theater;

public class TragedyCalculator extends PerformanceCalculator {
	public TragedyCalculator(Performance performance, Play play) {
		super(performance, play);
	}

	@Override
	public int amount() {
		int result = 40000;
		if (getPerformance().getAudience() > 30){
			result += 1000 * (getPerformance().getAudience() - 30);
		}
		return result;
	}
}
