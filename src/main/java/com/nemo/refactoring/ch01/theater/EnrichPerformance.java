package com.nemo.refactoring.ch01.theater;

public class EnrichPerformance {
	private final Performance performance;
	private final Play play;

	public EnrichPerformance(Performance performance, Play play) {
		this.performance = performance;
		this.play = play;
	}

	public Play getPlay() {
		return play;
	}

	public String getPlayId() {
		return performance.getPlayId();
	}

	public int getAudience() {
		return performance.getAudience();
	}
}
