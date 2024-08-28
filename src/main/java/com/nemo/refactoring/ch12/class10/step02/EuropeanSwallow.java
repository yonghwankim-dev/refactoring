package com.nemo.refactoring.ch12.class10.step02;

public class EuropeanSwallow extends Bird {
	public EuropeanSwallow(BirdInfo data) {
		super(data);
	}

	@Override
	public int getAirSpeedVelocity() {
		return 35;
	}
}
