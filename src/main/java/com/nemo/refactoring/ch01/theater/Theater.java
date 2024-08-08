package com.nemo.refactoring.ch01.theater;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Theater {

	private final Map<String, Play> plays;

	public Theater(Map<String, Play> plays) {
		this.plays = plays;
	}

	public String statement(Invoice invoice) {
		Statement statement = new Statement(
			invoice.getCustomer(),
			invoice.getPerformances().stream().map(enrichPerformance()).toList());
		return renderPlainText(statement);
	}

	private Function<Performance, EnrichPerformance> enrichPerformance() {
		return performance -> new EnrichPerformance(performance, playFor(performance));
	}

	private String renderPlainText(Statement statement) {
		StringBuilder result = new StringBuilder(String.format("Statement for %s", statement.getCustomer())).append("\n");
		for(EnrichPerformance perf : statement.getPerformances()){
			// print line for this order
			result.append(String.format(" %s: %s (%d seats)", perf.getPlay().getName(), usd(amountFor(perf)), perf.getAudience())).append("\n");
		}
		result.append(String.format("Amount owed is %s", usd(totalAmount(statement.getPerformances())))).append("\n");
		result.append(String.format("You earned %d credits", totalVolumeCredits(statement.getPerformances()))).append("\n");
		return result.toString();
	}

	private Play playFor(Performance aPerformance) {
		return plays.get(aPerformance.getPlayId());
	}

	private int amountFor(EnrichPerformance aPerformance) {
		int result;
		switch (aPerformance.getPlay().getType()) {
			case "tragedy":
				result = 40000;
				if (aPerformance.getAudience() > 30) {
					result += 1000 * (aPerformance.getAudience() - 30);
				}
				break;
			case "comedy":
				result = 30000;
				if (aPerformance.getAudience() > 20) {
					result += 10000 + 500 * (aPerformance.getAudience() - 20);
				}
				result += 300 * aPerformance.getAudience();
				break;
			default:
				throw new IllegalArgumentException("Unknown type: " + aPerformance.getPlay().getType());
		}
		return result;
	}

	private String usd(double aNumber) {
		return String.format("$%,.2f", aNumber / 100);
	}

	private int totalAmount(List<EnrichPerformance> performances) {
		int result = 0;
		for (EnrichPerformance perf : performances){
			result += amountFor(perf);
		}
		return result;
	}

	private int totalVolumeCredits(List<EnrichPerformance> performances) {
		int result = 0;
		for (EnrichPerformance perf : performances){
			result += volumeCreditsFor(perf);
		}
		return result;
	}

	private int volumeCreditsFor(EnrichPerformance perf) {
		int result;
		result = Math.max(perf.getAudience() - 30, 0);
		if ("comedy".equals(perf.getPlay().getType())) {
			result += (int)Math.floor((double)perf.getAudience() / 5);
		}
		return result;
	}
}
