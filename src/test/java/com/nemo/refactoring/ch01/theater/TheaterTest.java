package com.nemo.refactoring.ch01.theater;

import java.util.List;
import java.util.Map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TheaterTest {

	@DisplayName("calculate invoice fee")
	@Test
	void statement() {
		// given
		Map<String, Play> plays = Map.ofEntries(
			Map.entry("hamlet", new Play("Hamlet", "tragedy")),
			Map.entry("as-like", new Play("As You Like It", "comedy")),
			Map.entry("othello", new Play("Othello", "tragedy")));
		Theater theater = new Theater(plays);
		List<Performance> performances = List.of(
			new Performance("hamlet", 55),
			new Performance("as-like", 35),
			new Performance("othello", 40));
		Invoice invoice = new Invoice("BigCo", performances);
		// when
		String result = theater.statement(invoice);
		// then
		String expected = "Statement for BigCo\n" +
						  " Hamlet: $650.00 (55 seats)\n" +
						  " As You Like It: $580.00 (35 seats)\n" +
						  " Othello: $500.00 (40 seats)\n" +
						  "Amount owed is $1,730.00\n" +
						  "You earned 47 credits\n";
		Assertions.assertThat(result).isEqualTo(expected);
	}

}
