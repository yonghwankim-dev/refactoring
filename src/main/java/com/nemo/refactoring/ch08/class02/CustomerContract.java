package com.nemo.refactoring.ch08.class02;

import java.time.LocalDate;

public class CustomerContract {
	private final LocalDate startDate;
	public CustomerContract(LocalDate startDate) {
		this.startDate = startDate;
	}
}
