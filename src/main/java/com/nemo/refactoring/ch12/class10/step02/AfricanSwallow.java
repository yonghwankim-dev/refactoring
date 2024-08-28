package com.nemo.refactoring.ch12.class10.step02;

public class AfricanSwallow extends Bird {
	private final int numberOfCounts;

	public AfricanSwallow(BirdInfo data) {
		super(data);
		this.numberOfCounts = data.getNumberOfCounts();
	}

	@Override
	public int getAirSpeedVelocity() {
		return 40 - 2 * numberOfCounts;
	}
}
