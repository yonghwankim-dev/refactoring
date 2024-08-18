package com.nemo.refactoring.ch09.class01;

public class Haggis {

	public double distanceTravelled(Scenario scenario, int time){
		double secondaryTime = time - scenario.getDelay();
		return getPrimary(scenario, time) + getSecondary(scenario, secondaryTime);
	}

	private double getPrimary(Scenario scenario, int time) {
		double primaryTime = Math.min(time, scenario.getDelay());
		return 0.5 * scenario.primaryAcceleration() * primaryTime * primaryTime;
	}

	private double getSecondary(Scenario scenario, double secondaryTime) {
		if(secondaryTime > 0) {
			return scenario.primaryVelocity() * secondaryTime
				+ 0.5 * scenario.secondaryAcceleration() * secondaryTime * secondaryTime;
		}
		return 0;
	}
}
