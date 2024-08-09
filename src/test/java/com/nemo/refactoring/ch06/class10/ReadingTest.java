package com.nemo.refactoring.ch06.class10;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReadingTest {

	@DisplayName("calculate baesCharge for reading")
	@Test
	void baseCharge(){
	    // given
		Reading kim = new Reading("kim", 10, 8, 2024);
		// when
	    double baseCharge = kim.baseCharge();
	    // then
		Assertions.assertThat(baseCharge).isCloseTo(1.8, Offset.offset(0.1));
	}
}
