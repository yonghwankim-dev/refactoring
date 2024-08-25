package com.nemo.refactoring.ch11.class06.step01;

public class HeatingPlan {

	private final int min;
	private final int max;
	private final Thermostat thermostat;

	public HeatingPlan(int min, int max) {
		this.min = min;
		this.max = max;
		this.thermostat = new Thermostat(25);
	}

	public int targetTemperature() {
		if (thermostat.selectedTemperature() > max) {
			return max;
		} else if (thermostat.selectedTemperature() < min) {
			return min;
		}
		return thermostat.selectedTemperature();
	}
}
