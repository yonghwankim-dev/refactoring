package com.nemo.refactoring.ch10.class05.step01;

public class BillingPlan {

	private final String name;

	public BillingPlan(String name) {
		this.name = name;
	}

	public String basic(){
		return "basic";
	}

	public String getName() {
		return name;
	}
}
