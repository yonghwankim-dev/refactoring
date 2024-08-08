package com.nemo.refactoring.ch01.theater;

public class EnrichPerformance {
	private final Performance performance;
	private final Play play;
	private final int amount;

	public EnrichPerformance(Performance performance, Play play, int amount) {
		this.performance = performance;
		this.play = play;
		this.amount = amount;
	}

	public Play getPlay() {
		return play;
	}

	public int getAudience() {
		return performance.getAudience();
	}
}
