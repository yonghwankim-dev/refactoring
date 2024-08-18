package com.nemo.refactoring.ch09.class04;

public class TeleponeNumber {
	private final String areaCode;
	private final String number;

	public TeleponeNumber(String areaCode, String number) {
		this.areaCode = areaCode;
		this.number = number;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getNumber() {
		return number;
	}
}
