package com.nemo.refactoring.ch06.class01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OwingTest {

	@DisplayName("Generating debt information according to Invoice")
	@Test
	void statement(){
	    // given
		List<Order> orders = List.of(new Order(600), new Order(400));
		Invoice invoice = new Invoice(orders);
		Owing owing = new Owing();
		// when
		String statement = owing.statement(invoice);
		// then
		String expected = """
			************************
			**** customer owing ****
			************************
			
			customer: BigCo
			amount: $1,000.00
			due date: 2024-12-31
			""";
		Assertions.assertThat(statement).isEqualTo(expected);
	}

}
