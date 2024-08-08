package com.nemo.refactoring.ch06.class04;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@DisplayName("Test if Order is basePrice")
	@Test
	void isBasePrice(){
	    // given
		Order order = new Order(100, 10000);
		Calculator calculator = new Calculator();
		// when
		boolean isBasePrice = calculator.isBasePrice(order);
		// then
		Assertions.assertThat(isBasePrice).isTrue();
	}

}
