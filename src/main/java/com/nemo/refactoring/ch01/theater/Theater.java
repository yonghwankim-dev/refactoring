package com.nemo.refactoring.ch01.theater;

import java.util.Map;

public class Theater {

	public String statement(Invoice invoice, Map<String, Play> plays) {
		return renderPlainText(createStatementData(invoice, plays));
	}

	private Statement createStatementData(Invoice invoice, Map<String, Play> plays) {
		return new Statement(invoice, plays);
	}

	private String renderPlainText(Statement statement) {
		StringBuilder result = new StringBuilder(String.format("Statement for %s", statement.getCustomer())).append("\n");
		for(EnrichPerformance perf : statement.getPerformances()){
			// print line for this order
			result.append(String.format(" %s: %s (%d seats)", perf.getPlay().getName(), usd(perf.getAmount()), perf.getAudience())).append("\n");
		}
		result.append(String.format("Amount owed is %s", usd(statement.getTotalAmount()))).append("\n");
		result.append(String.format("You earned %d credits", statement.getTotalVolumeCredits())).append("\n");
		return result.toString();
	}

	private String usd(double aNumber) {
		return String.format("$%,.2f", aNumber / 100);
	}
}
