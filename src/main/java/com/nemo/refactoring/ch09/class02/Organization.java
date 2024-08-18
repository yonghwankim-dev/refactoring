package com.nemo.refactoring.ch09.class02;

public class Organization {
	private final String name;
	private final String country;

	public Organization(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return name + ", " + country;
	}
}
