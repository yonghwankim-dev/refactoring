package com.nemo.refactoring.ch12.class10.step02;

public class Bird {

	private final String name;
	private final String plumage; // 깃털

	public Bird(BirdInfo data) {
		this.name = data.getName();
		this.plumage = data.getPlumage();
	}

	public static Bird createBird(BirdInfo data) {
		return switch (data.getType()) {
			case "유럽 제비" -> new EuropeanSwallow(data);
			case "아프리카 제비" -> new AfricanSwallow(data);
			case "노르웨이 파란 앵무" -> new NorwegianBlueParrot(data);
			default -> new Bird(data);
		};
	}

	public String getName() {
		return name;
	}

	public String getPlumage() {
		return plumage != null ? plumage : "보통이다";
	}

	public int getAirSpeedVelocity() {
		return 0;
	}
}
