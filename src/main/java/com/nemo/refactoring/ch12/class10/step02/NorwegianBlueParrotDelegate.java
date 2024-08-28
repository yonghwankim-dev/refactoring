package com.nemo.refactoring.ch12.class10.step02;

public class NorwegianBlueParrotDelegate {
	private final int voltage;
	private final boolean isNailed;
	private final Bird bird;

	public NorwegianBlueParrotDelegate(BirdInfo data, Bird bird) {
		this.voltage = data.getVoltage();
		this.isNailed = data.isNailed();
		this.bird = bird;
	}

	public String getPlumage() {
		if (this.voltage > 100) {
			return "그을렸다";
		}
		return this.bird.getPlumage() != null ? this.bird.getPlumage() : "예쁘다";
	}

	public int getAirSpeedVelocity() {
		return isNailed ? 0 : 10 + this.voltage / 10;
	}
}
