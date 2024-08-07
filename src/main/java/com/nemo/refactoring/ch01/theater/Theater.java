package com.nemo.refactoring.ch01.theater;

import java.util.List;
import java.util.Map;

public class Theater {

	private final Map<String, Play> plays;

	public Theater(Map<String, Play> plays) {
		this.plays = plays;
	}

	public String statement(Invoice invoice) {
		StringBuilder result = new StringBuilder(String.format("Statement for %s", invoice.getCustomer())).append("\n");

		for(Performance perf : invoice.getPerformances()){
			// print line for this order
			result.append(String.format(" %s: %s (%d seats)", playFor(perf).getName(), usd(amountFor(perf)), perf.getAudience())).append("\n");
		}
		result.append(String.format("Amount owed is %s", usd(totalAmount(invoice)))).append("\n");
		result.append(String.format("You earned %d credits", totalVolumeCredits(invoice.getPerformances()))).append("\n");
		return result.toString();
	}

	private Play playFor(Performance aPerformance) {
		return plays.get(aPerformance.getPlayId());
	}

	private int amountFor(Performance aPerformance) {
		int result;
		switch (playFor(aPerformance).getType()) {
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
				throw new IllegalArgumentException("Unknown type: " + playFor(aPerformance).getType());
		}
		return result;
	}

	private String usd(double aNumber) {
		return String.format("$%,.2f", aNumber / 100);
	}

	private int totalAmount(Invoice invoice) {
		int result = 0;
		for (Performance perf : invoice.getPerformances()){
			result += amountFor(perf);
		}
		return result;
	}

	private int totalVolumeCredits(List<Performance> performances) {
		int result = 0;
		for (Performance perf : performances){
			result += volumeCreditsFor(perf);
		}
		return result;
	}

	private int volumeCreditsFor(Performance perf) {
		int result;
		result = Math.max(perf.getAudience() - 30, 0);
		if ("comedy".equals(playFor(perf).getType())) {
			result += (int)Math.floor((double)perf.getAudience() / 5);
		}
		return result;
	}
}
