package com.nemo.refactoring.ch12.class10.step02;

public class AfricanSwallowDelegate {

	private final int numberOfCoconuts;
	private final Bird bird;

	public AfricanSwallowDelegate(BirdInfo data, Bird bird) {
		this.numberOfCoconuts = data.getNumberOfCounts();
		this.bird = bird;
	}

	public String getPlumage() {
		return this.bird != null ? this.bird.getPlumage() : "보통이다";
	}

	public int getAirSpeedVelocity() {
		return 40 - 2 * numberOfCoconuts;
	}
}
