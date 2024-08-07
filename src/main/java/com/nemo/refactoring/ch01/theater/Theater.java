package com.nemo.refactoring.ch01.theater;

import java.util.Map;

public class Theater {
	public String statement(Invoice invoice, Map<String, Play> plays) {
		int totalAmount = 0;
		int volumeCredits = 0;
		StringBuilder result = new StringBuilder(String.format("Statement for %s", invoice.getCustomer())).append("\n");

		for(Performance perf : invoice.getPerformances()){
			final Play play = plays.get(perf.getPlayId());
			int thisAmount;

			switch (play.getType()) {
				case "tragedy":
					thisAmount = 40000;
					if (perf.getAudience() > 30) {
						thisAmount += 1000 * (perf.getAudience() - 30);
					}
					break;
				case "comedy":
					thisAmount = 30000;
					if (perf.getAudience() > 20) {
						thisAmount += 10000 + 500 * (perf.getAudience() - 20);
					}
					thisAmount += 300 * perf.getAudience();
					break;
				default:
					throw new IllegalArgumentException("Unknown type: " + play.getType());
			}
			// add volume credits
			volumeCredits += Math.max(perf.getAudience() - 30, 0);
			// add extra credit for every five comedy attendees
			if ("comedy".equals(play.getType())) {
				volumeCredits += (int)Math.floor((double)perf.getAudience() / 5);
			}

			// print line for this order
			result.append(String.format(" %s: $%,.2f (%d seats)", play.getName(), (double)thisAmount / 100, perf.getAudience())).append("\n");
			totalAmount += thisAmount;
		}

		result.append(String.format("Amount owed is $%,.2f", (double)totalAmount / 100)).append("\n");
		result.append(String.format("You earned %d credits", volumeCredits)).append("\n");
		return result.toString();
	}
}
