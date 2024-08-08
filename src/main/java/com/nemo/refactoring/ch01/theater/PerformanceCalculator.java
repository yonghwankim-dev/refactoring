package com.nemo.refactoring.ch01.theater;

public abstract class PerformanceCalculator {
	private final Performance performance;
	private final Play play;

	public PerformanceCalculator(Performance performance, Play play) {
		this.performance = performance;
		this.play = play;
	}

	public abstract int amount();

	public int volumeCredits() {
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
