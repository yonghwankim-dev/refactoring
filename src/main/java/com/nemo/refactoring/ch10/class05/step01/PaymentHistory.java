package com.nemo.refactoring.ch10.class05.step01;

import java.time.LocalDate;

import org.springframework.cglib.core.Local;

public class PaymentHistory {
	private final LocalDate value;

	public PaymentHistory(LocalDate value) {
		this.value = value;
	}

	public int weeksDelinquentInLastYear() {
		return (int) Math.ceil((LocalDate.now().toEpochDay() - value.toEpochDay()) / 7);
	}
}
