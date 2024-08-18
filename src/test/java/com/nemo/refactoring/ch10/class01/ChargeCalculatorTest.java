package com.nemo.refactoring.ch10.class01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ChargeCalculatorTest {

	@DisplayName("요금을 계산한다")
	@Test
	void calculateCharge(){
	    // given
		ChargeCalculator calculator = new ChargeCalculator(10,
			new Plan(LocalDate.of(2024, 8, 1), LocalDate.of(2024, 8, 31), 10, 20));
		// when
		int result = calculator.calculateCharge(LocalDate.of(2024, 8, 2));
		// then
		Assertions.assertThat(result).isEqualTo(100);
	}
}
