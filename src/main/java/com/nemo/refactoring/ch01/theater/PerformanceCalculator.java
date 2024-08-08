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
				throw new UnsupportedOperationException("Please use TragedyCalculator for the tragedy performance fee");
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

	public int volumeCreditsFor() {
		int result;
		result = Math.max(performance.getAudience() - 30, 0);
		if ("comedy".equals(play.getType())) {
			result += (int)Math.floor((double)performance.getAudience() / 5);
		}
		return result;
	}

	public Performance getPerformance() {
		return performance;
	}
}
