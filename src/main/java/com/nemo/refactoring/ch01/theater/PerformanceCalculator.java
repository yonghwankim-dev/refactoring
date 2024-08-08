package com.nemo.refactoring.ch01.theater;

public class PerformanceCalculator {
	private final Performance performance;
	private final Play play;

	public PerformanceCalculator(Performance performance, Play play) {
		this.performance = performance;
		this.play = play;
	}

	public int amount() {
		int result;
		switch (this.play.getType()) {
			case "tragedy":
				result = 40000;
				if (performance.getAudience() > 30) {
					result += 1000 * (performance.getAudience() - 30);
				}
				break;
			case "comedy":
				result = 30000;
				if (performance.getAudience() > 20) {
					result += 10000 + 500 * (performance.getAudience() - 20);
				}
				result += 300 * performance.getAudience();
				break;
			default:
				throw new IllegalArgumentException("Unknown type: " + play.getType());
		}
		return result;
	}
}
