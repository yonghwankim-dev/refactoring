package com.nemo.refactoring.ch09.class01;

public class Haggis {

	public double distanceTravelled(Scenario scenario, int time){
		double result = 0;
		double primaryTime = Math.min(time, scenario.getDelay());
		result = 0.5 * scenario.primaryAcceleration() * primaryTime * primaryTime; // 전파된 거리
		double secondaryTime = time - scenario.getDelay();
		result += getSecondary(scenario, secondaryTime);
		return result;
	}

	private double getSecondary(Scenario scenario, double secondaryTime) {
		if(secondaryTime > 0) {
			return scenario.primaryVelocity() * secondaryTime
				+ 0.5 * scenario.secondaryAcceleration() * secondaryTime * secondaryTime;
		}
		return 0;
	}
}
