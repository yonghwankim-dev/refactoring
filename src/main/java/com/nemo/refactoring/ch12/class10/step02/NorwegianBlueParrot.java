package com.nemo.refactoring.ch12.class10.step02;

public class NorwegianBlueParrot extends Bird {
	private final int voltage;
	private final boolean isNailed;

	public NorwegianBlueParrot(BirdInfo data) {
		super(data);
		this.voltage = data.getVoltage();
		this.isNailed = data.isNailed();
	}

	@Override
	public String getPlumage() {
		if (this.voltage > 100) {
			return "그을렸다";
		}
		return super.getPlumage() != null ? super.getPlumage() : "예쁘다";
	}

	@Override
	public int getAirSpeedVelocity() {
		return isNailed ? 0 : 10 + this.voltage / 10;
	}
}
