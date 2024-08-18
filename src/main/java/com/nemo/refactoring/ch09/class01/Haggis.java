package com.nemo.refactoring.ch09.class01;

public class Haggis {

	public double distanceTravelled(Scenario scenario, int time){
		double secondaryTime = time - scenario.getDelay();
		return getPrimary(scenario, minDelay(scenario.getDelay(), time)) + getSecondary(scenario, secondaryTime);
	}

	private double getPrimary(Scenario scenario, double primaryTime) {
		return 0.5 * scenario.primaryAcceleration() * primaryTime * primaryTime;
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
