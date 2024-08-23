package com.nemo.refactoring.ch10.class05.step01;

public class NullPaymentHistory extends PaymentHistory {

	public NullPaymentHistory(boolean delinquent, int delinquentWeeks) {
		super(delinquent, delinquentWeeks);
	}

	@Override
	public int getWeeksDelinquentInLastYear() {
		return 0;
	}
}
