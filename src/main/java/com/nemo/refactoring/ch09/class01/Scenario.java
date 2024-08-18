package com.nemo.refactoring.ch09.class01;

public class Scenario {
	private final double primaryForce;
	private final double mass;
	private final double delay;
	private final double secondaryForce;

	public Scenario(double primaryForce, double mass, double delay, double secondaryForce) {
		this.primaryForce = primaryForce;
		this.mass = mass;
		this.delay = delay;
		this.secondaryForce = secondaryForce;
	}

	public double getPrimaryForce() {
		return primaryForce;
	}

	public double getMass() {
		return mass;
	}

	public double getDelay() {
		return delay;
	}

	public double getSecondaryForce() {
		return secondaryForce;
	}
}
