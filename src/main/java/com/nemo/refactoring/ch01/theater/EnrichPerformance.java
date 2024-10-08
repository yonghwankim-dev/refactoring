package com.nemo.refactoring.ch01.theater;

public class EnrichPerformance {
	private final Performance performance;
	private final Play play;
	private final int amount;
	private final int volumeCredits;

	public EnrichPerformance(Performance performance, Play play) {
		PerformanceCalculator calculator = createPerformanceCalculator(performance, play);
		this.performance = performance;
		this.play = play;
		this.amount = calculator.amount();
		this.volumeCredits = calculator.volumeCredits();
	}

	private PerformanceCalculator createPerformanceCalculator(Performance performance, Play play) {
		return switch (play.getType()) {
			case "tragedy" -> new TragedyCalculator(performance, play);
			case "comedy" -> new ComedyCalculator(performance, play);
			default -> throw new IllegalArgumentException("Unknown type: " + play.getType());
		};
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
