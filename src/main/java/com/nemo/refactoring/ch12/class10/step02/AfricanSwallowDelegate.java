package com.nemo.refactoring.ch12.class10.step02;

public class AfricanSwallowDelegate {

	private final int numberOfCoconuts;

	public AfricanSwallowDelegate(BirdInfo data) {
		this.numberOfCoconuts = data.getNumberOfCounts();
	}

	public int getAirSpeedVelocity() {
		return 40 - 2 * numberOfCoconuts;
	}
}
