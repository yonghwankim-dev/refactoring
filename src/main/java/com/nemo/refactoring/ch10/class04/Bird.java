package com.nemo.refactoring.ch10.class04;

public class Bird {
	private final String name;
	private final String type;
	private final int numberOfCoconuts;
	private final int voltage;

	private final boolean isNailed;

	public Bird(String name, String type, int numberOfCoconuts, int voltage, boolean isNailed) {
		this.name = name;
		this.type = type;
		this.numberOfCoconuts = numberOfCoconuts;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getNumberOfCoconuts() {
		return numberOfCoconuts;
	}

	public int getVoltage() {
		return voltage;
	}

	public boolean isNailed() {
		return isNailed;
	}
}
