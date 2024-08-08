package com.nemo.refactoring.ch01.theater;

public class EnrichPerformance {
	private Performance performance;
	private Play play;

	public EnrichPerformance(Performance performance, Play play) {
		this.performance = performance;
		this.play = play;
	}

	public String getPlayId() {
		return performance.getPlayId();
	}

	public int getAudience() {
		return performance.getAudience();
	}
}
