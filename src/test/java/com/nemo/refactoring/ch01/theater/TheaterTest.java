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
		Theater theater = new Theater();
		List<Performance> performances = List.of(
			new Performance("hamlet", 55),
			new Performance("as-like", 35),
			new Performance("othello", 40));
		Invoice invoice = new Invoice("BigCo", performances);
		// when
		String result = theater.statement(invoice, plays);
		// then
		String expected = """
			Statement for BigCo
			 Hamlet: $650.00 (55 seats)
			 As You Like It: $580.00 (35 seats)
			 Othello: $500.00 (40 seats)
			Amount owed is $1,730.00
			You earned 47 credits
			""";
		Assertions.assertThat(result).isEqualTo(expected);
	}

	@DisplayName("calculate html invoice fee")
	@Test
	void htmlStatement(){
		// given
		Map<String, Play> plays = Map.ofEntries(
			Map.entry("hamlet", new Play("Hamlet", "tragedy")),
			Map.entry("as-like", new Play("As You Like It", "comedy")),
			Map.entry("othello", new Play("Othello", "tragedy")));
		Theater theater = new Theater();
		List<Performance> performances = List.of(
			new Performance("hamlet", 55),
			new Performance("as-like", 35),
			new Performance("othello", 40));
		Invoice invoice = new Invoice("BigCo", performances);
		// when
		String result = theater.htmlStatement(invoice, plays);
		// then
		String expected = """
			<h1>Statement for BigCo</h1>
			<table>
			<tr><th>Play</th><th>Cost</th><th>Seats</th></tr>
			<tr><td>Hamlet</td><td>$650.00</td><td>55</td></tr>
			<tr><td>As You Like It</td><td>$580.00</td><td>35</td></tr>
			<tr><td>Othello</td><td>$500.00</td><td>40</td></tr>
			</table>
			<p>Amount owed is <em>$1,730.00</em></p>
			<p>You earned <em>47</em> credits</p>
			""";
		Assertions.assertThat(result).isEqualTo(expected);
	}

}
