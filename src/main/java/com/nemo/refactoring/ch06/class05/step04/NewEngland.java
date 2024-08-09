package com.nemo.refactoring.ch06.class05.step04;

import java.util.List;

public class NewEngland {

	private List<String> states = List.of("MA", "CT", "ME", "VT", "NH", "RI");

	public boolean isNewEngland(Customer customer) {
		return newIsNewEngland(customer.getAddress().getState());
	}

	private boolean newIsNewEngland(String state) {
		return states.contains(state);
	}
}
