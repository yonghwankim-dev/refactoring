package com.nemo.refactoring.ch12.class10.step02;

public class EuropeanSwallowDelegate {

	private final Bird bird;

	public EuropeanSwallowDelegate(Bird bird) {
		this.bird = bird;
	}

	public String getPlumage() {
		return this.bird != null ? this.bird.getPlumage() : "보통이다";
	}

	public int getAirSpeedVelocity() {
		return 35;
	}
}
