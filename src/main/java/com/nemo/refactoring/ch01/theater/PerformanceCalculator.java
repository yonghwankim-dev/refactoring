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
		return Math.max(performance.getAudience() - 30, 0);
	}

	public Performance getPerformance() {
		return performance;
	}
}
