package com.nemo.refactoring.ch01.theater;

import java.util.List;
import java.util.Map;

public class Theater {
	public String statement(Invoice invoice, Map<String, Play> plays) {
		int totalAmount = 0;
		int volumeCredits = 0;
		String result = String.format("Statement for %s\n", invoice.getCustomer());

		for(Performance perf : invoice.getPerformances()){
		}
		return null;
	}
}
