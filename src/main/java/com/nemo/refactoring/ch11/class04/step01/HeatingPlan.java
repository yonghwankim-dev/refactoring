package com.nemo.refactoring.ch11.class04.step01;

public class HeatingPlan {
	private final TemperatureRange temperatureRange;

	public HeatingPlan(TemperatureRange temperatureRange) {
		this.temperatureRange = temperatureRange;
	}

	public boolean withinRange(int bottom, int top) {
		return (bottom >= this.temperatureRange.getLow())
			&& (top <= this.temperatureRange.getHigh());
	}
}
