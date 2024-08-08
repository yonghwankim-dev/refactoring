package com.nemo.refactoring.ch06.class03.step01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.nemo.refactoring.ch06.class03.step01.Calculator;
import com.nemo.refactoring.ch06.class03.step01.Order;

class CalculatorTest {
	@DisplayName("calculate order price")
	@Test
	void price(){
	    // given
		Calculator calculator = new Calculator();
		Order order = new Order(10, 1000);
		// when
		int price = calculator.price(order);
		// then
		Assertions.assertThat(price).isEqualTo(10100);
	}
}
