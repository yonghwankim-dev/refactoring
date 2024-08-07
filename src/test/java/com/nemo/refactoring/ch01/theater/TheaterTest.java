package com.nemo.refactoring.ch01.theater;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TheaterTest {

	@DisplayName("calculate invoice fee")
	@Test
	void statement() {
		// given
		Theater theater = new Theater();
		List<Play> plays = List.of(new Play("Hamlet", "tragedy"), new Play("As You Like It", "comedy"),
			new Play("Othello", "tragedy"));
		List<Performance> performances = List.of(new Performance("Hamlet", 55), new Performance("As You Like It", 35),
			new Performance("Othello", 40));
		Invoice invoice = new Invoice("BigCo", performances);
		// when
		String result = theater.statement(invoice, plays);
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
