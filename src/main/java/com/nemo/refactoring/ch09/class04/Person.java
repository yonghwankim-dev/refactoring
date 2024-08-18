package com.nemo.refactoring.ch09.class04;

public class Person {
	private TeleponeNumber teleponeNumber;

	public Person() {
		this.teleponeNumber = new TeleponeNumber();
	}

	public TeleponeNumber getTeleponeNumber() {
		return teleponeNumber;
	}

	public void setTeleponeNumber(TeleponeNumber teleponeNumber) {
		this.teleponeNumber = teleponeNumber;
	}
}
