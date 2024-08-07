package com.nemo.refactoring.ch01.theater;

import java.util.Map;

public class Theater {
	public String statement(Invoice invoice, Map<String, Play> plays) {
		int totalAmount = 0;
		int volumeCredits = 0;
		StringBuilder result = new StringBuilder(String.format("Statement for %s", invoice.getCustomer())).append("\n");

		for(Performance perf : invoice.getPerformances()){
			final Play play = plays.get(perf.getPlayId());
			// add volume credits
			volumeCredits += Math.max(perf.getAudience() - 30, 0);
			// add extra credit for every five comedy attendees
			if ("comedy".equals(play.getType())) {
				volumeCredits += (int)Math.floor((double)perf.getAudience() / 5);
			}

			// print line for this order
			result.append(String.format(" %s: $%,.2f (%d seats)", play.getName(), (double)amountFor(perf, play) / 100, perf.getAudience())).append("\n");
			totalAmount += amountFor(perf, play);
		}

		result.append(String.format("Amount owed is $%,.2f", (double)totalAmount / 100)).append("\n");
		result.append(String.format("You earned %d credits", volumeCredits)).append("\n");
		return result.toString();
	}

	private int amountFor(Performance aPerformance, Play play) {
		int result;
		switch (play.getType()) {
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
				throw new IllegalArgumentException("Unknown type: " + play.getType());
		}
		return result;
	}
}
