package com.nemo.refactoring.ch11.class02.step01;

public class Calculator {
	public int tenPercentRaise(Person person){
		return (int)(person.getSalary() * 1.1);
	}

	public int fivePercentRaise(Person person){
		return (int)(person.getSalary() * 1.05);
	}
}
