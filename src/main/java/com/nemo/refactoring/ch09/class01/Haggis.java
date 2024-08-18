package com.nemo.refactoring.ch09.class01;

public class Haggis {

	public double distanceTravelled(Scenario scenario, int time){
		double result = 0;
		double acc = scenario.getPrimaryForce() / scenario.getMass(); // 가속도 = 힘 / 질량
		double primaryTime = Math.min(time, scenario.getDelay());
		result = 0.5 * acc * primaryTime * primaryTime; // 전파된 거리
		double secondaryTime = time - scenario.getDelay();
		if(secondaryTime > 0) {
			double primaryVelocity = acc * scenario.getDelay();
			acc = (scenario.getPrimaryForce() + scenario.getSecondaryForce()) / scenario.getMass();
			result += primaryVelocity * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
		}
		return result;
	}
}
