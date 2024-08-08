package com.nemo.refactoring.ch01.theater;

import java.util.List;
import java.util.Map;

public class Statement {
	private final Map<String, Play> plays;
	private final String customer;
	private final List<EnrichPerformance> performances;
	private final int totalAmount;
	private final int totalVolumeCredits;

	public Statement(Invoice invoice, Map<String, Play> plays){
		this.plays = plays;
		this.customer = invoice.getCustomer();
		this.performances = invoice.getPerformances().stream()
			.map(this::enrichPerformance)
			.toList();
		this.totalAmount = totalAmount(performances);
		this.totalVolumeCredits = totalVolumeCredits(performances);
	}

	private EnrichPerformance enrichPerformance(Performance performance) {
		return new EnrichPerformance(performance, playFor(performance), volumeCreditsFor(performance));
	}

	private Play playFor(Performance aPerformance) {
		return plays.get(aPerformance.getPlayId());
	}

	private int volumeCreditsFor(Performance perf) {
		int result;
		result = Math.max(perf.getAudience() - 30, 0);
		if ("comedy".equals(playFor(perf).getType())) {
			result += (int)Math.floor((double)perf.getAudience() / 5);
		}
		return result;
	}

	private int totalAmount(List<EnrichPerformance> performances) {
		return performances.stream()
			.map(EnrichPerformance::getAmount)
			.reduce(0, Integer::sum);
	}

	private int totalVolumeCredits(List<EnrichPerformance> performances) {
		return performances.stream()
			.map(EnrichPerformance::getVolumeCredits)
			.reduce(0, Integer::sum);
	}

	public int amountFor(Performance performance){
		return new PerformanceCalculator(performance, playFor(performance)).amount();
	}

	public String getCustomer() {
		return customer;
	}

	public List<EnrichPerformance> getPerformances() {
		return performances;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public int getTotalVolumeCredits() {
		return totalVolumeCredits;
	}
}
