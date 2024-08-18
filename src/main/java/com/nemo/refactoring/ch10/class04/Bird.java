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

	public String plumage() {
		return switch (type) {
			case "유럽 제비" -> "보통이다";
			case "아프리카 제비" -> numberOfCoconuts > 2 ? "지쳤다" : "보통이다";
			case "노르웨이 파란 앵무" -> voltage > 100 ? "그을렸다" : "예쁘다";
			default -> "unknown";
		};
	}

	public Integer airSpeedVelocity() {
		switch (type){
			case "유럽 제비" -> {
				return 35;
			}
			case "아프리카 제비" -> {
				return 40 - 2 * numberOfCoconuts;
			}
			case "노르웨이 파란 앵무" -> {
				return isNailed ? 0 : 10 + voltage / 10;
			}
			default -> {
				return null;
			}
		}
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
