package com.nemo.refactoring.ch01.theater;

public class EnrichPerformance {
	private Performance performance;

	public EnrichPerformance(Performance performance) {
		this.performance = performance;
	}

	public String getPlayId() {
		return performance.getPlayId();
	}

	public int getAudience() {
		return performance.getAudience();
	}
}
