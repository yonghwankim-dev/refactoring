package com.nemo.refactoring.ch09.class01;

public class Haggis {

	public double distanceTravelled(Scenario scenario, int time){
		double secondaryTime = time - scenario.getDelay();
		return getPrimary(scenario, time) + getSecondary(scenario, secondaryTime);
	}

	private double getPrimary(Scenario scenario, int time) {
		return 0.5 * scenario.primaryAcceleration() * minDelay(scenario.getDelay(), time) * minDelay(scenario.getDelay(), time);
	}

	private double minDelay(double delay, int time) {
		return Math.min(time, delay);
	}

	private double getSecondary(Scenario scenario, double secondaryTime) {
		if(secondaryTime > 0) {
			return scenario.primaryVelocity() * secondaryTime
				+ 0.5 * scenario.secondaryAcceleration() * secondaryTime * secondaryTime;
		}
		return 0;
	}
}
