package com.nemo.refactoring.ch08.class02.step02;

public class Account {

	enum AccountType {
		PREMIUM(0.1), STANDARD(0.05);

		private final double interestRate;

		AccountType(double interestRate) {
			this.interestRate = interestRate;
		}
	}

	private int number;
	private AccountType type;

	public Account(int number, AccountType type, double interestRate) {
		this.number = number;
		this.type = type;
		assert interestRate == this.type.interestRate;
	}

	public double interestRate(){
		return type.interestRate;
	}
}
