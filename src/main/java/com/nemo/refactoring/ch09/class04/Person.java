package com.nemo.refactoring.ch09.class04;

public class Person {
	private TeleponeNumber teleponeNumber;

	public Person(String areaCode, String number) {
		this.teleponeNumber = new TeleponeNumber(areaCode, number);
	}

	public TeleponeNumber getTeleponeNumber() {
		return teleponeNumber;
	}

	public void setTeleponeNumber(TeleponeNumber teleponeNumber) {
		this.teleponeNumber = teleponeNumber;
	}
}
