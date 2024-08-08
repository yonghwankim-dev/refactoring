package com.nemo.refactoring.ch01.theater;

public class EnrichPerformance {
	private final Performance performance;
	private final Play play;
	private final int amount;
	private final int volumeCredits;

	public EnrichPerformance(Performance performance, Play play, int amount, int volumeCredits) {
		PerformanceCalculator calculator = new PerformanceCalculator(performance, play);
		this.performance = performance;
		this.play = play;
		this.amount = amount;
		this.volumeCredits = volumeCredits;
	}

	public Play getPlay() {
		return play;
	}

	public int getAudience() {
		return performance.getAudience();
	}

	public int getAmount() {
		return amount;
	}

	public int getVolumeCredits() {
		return volumeCredits;
	}
}
