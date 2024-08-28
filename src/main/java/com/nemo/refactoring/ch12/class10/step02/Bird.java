package com.nemo.refactoring.ch12.class10.step02;

public class Bird {

	private final String name;
	private final String plumage; // 깃털
	private final Object speciesDelegate;

	public Bird(BirdInfo data) {
		this.name = data.getName();
		this.plumage = data.getPlumage();
		this.speciesDelegate = this.selectSpeciesDelegate(data);
	}

	private Object selectSpeciesDelegate(BirdInfo data) {
		return switch (data.getType()) {
			case "유럽 제비" -> new EuropeanSwallowDelegate(this);
			case "아프리카 제비" -> new AfricanSwallowDelegate(data, this);
			case "노르웨이 파란 앵무" -> new NorwegianBlueParrotDelegate(data, this);
			default -> null;
		};
	}

	public static Bird createBird(BirdInfo data) {
		return new Bird(data);
	}

	public String getName() {
		return name;
	}

	public String getPlumage() {
		if (this.speciesDelegate instanceof NorwegianBlueParrotDelegate) {
			return ((NorwegianBlueParrotDelegate)this.speciesDelegate).getPlumage();
		}
		return this.speciesDelegate != null ? plumage : "보통이다";
	}

	public int getAirSpeedVelocity() {
		if (this.speciesDelegate == null) {
			return 0;
		}
		if (this.speciesDelegate instanceof EuropeanSwallowDelegate) {
			return ((EuropeanSwallowDelegate)this.speciesDelegate).getAirSpeedVelocity();
		}
		if (this.speciesDelegate instanceof AfricanSwallowDelegate) {
			return ((AfricanSwallowDelegate)this.speciesDelegate).getAirSpeedVelocity();
		}
		return ((NorwegianBlueParrotDelegate)this.speciesDelegate).getAirSpeedVelocity();
	}

	public Object getSpeciesDelegate() {
		return speciesDelegate;
	}
}
