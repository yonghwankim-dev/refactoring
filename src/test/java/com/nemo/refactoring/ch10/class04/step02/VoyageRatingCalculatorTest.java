package com.nemo.refactoring.ch10.class04.step02;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VoyageRatingCalculatorTest {

	@DisplayName("선박 정보와 선박의 항해 이력을 참고하여 선박의 항해 투자 등급을 계산한다")
	@Test
	void rating(){
	    // given
		VoyageRatingCalculator calculator = new VoyageRatingCalculator();
		Voyage voyage = new Voyage("중국", 10);
		List<Voyage> history = Collections.emptyList();
		// when
		String rating = calculator.rating(voyage, history);
		// then
		String expected = "A";
		Assertions.assertThat(rating).isEqualTo(expected);
	}

}
