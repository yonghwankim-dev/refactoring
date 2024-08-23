package com.nemo.refactoring.ch10.class05.step02;

public class PaymentHistory {

	private final boolean delinquent;
	private final int delinquentWeeks;

	public PaymentHistory(boolean delinquent, int delinquentWeeks) {
		this.delinquent = delinquent;
		this.delinquentWeeks = delinquentWeeks;
	}

	public int getWeeksDelinquentInLastYear() {
		return delinquent ? delinquentWeeks : 0;
	}
}
