package com.nemo.refactoring.ch01.theater;

public class PerformanceCalculator {
	private final Performance performance;
	private final Play play;

	public PerformanceCalculator(Performance performance, Play play) {
		this.performance = performance;
		this.play = play;
	}
}
