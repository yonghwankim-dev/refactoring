package com.nemo.refactoring.ch12.class10.step02;

public class Bird {

	private final String name;
	private final String plumage; // 깃털
	private final EuropeanSwallowDelegate speciesDelegate;

	public Bird(BirdInfo data) {
		this.name = data.getName();
		this.plumage = data.getPlumage();
		this.speciesDelegate = this.selectSpeciesDelegate(data);
	}

	private EuropeanSwallowDelegate selectSpeciesDelegate(BirdInfo data) {
		return switch (data.getType()) {
			case "유럽 제비" -> new EuropeanSwallowDelegate();
			default -> null;
		};
	}

	public static Bird createBird(BirdInfo data) {
		return switch (data.getType()) {
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
		return this.speciesDelegate != null ? this.speciesDelegate.getAirSpeedVelocity() : 0;
	}

	public EuropeanSwallowDelegate getSpeciesDelegate() {
		return speciesDelegate;
	}
}
