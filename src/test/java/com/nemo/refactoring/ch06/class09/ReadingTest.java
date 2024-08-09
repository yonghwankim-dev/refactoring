package com.nemo.refactoring.ch06.class09;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReadingTest {
	@DisplayName("calculate baseCharge")
	@Test
	void calculateBaseCharge(){
	    // given
		Reading reading = new Reading("kim", 10, LocalDate.of(2024, 8, 9));
	    // when
		// 0.18 * 10 = 1.8
		double baseCharge = Reading.baseRate(reading.getTime().getMonthValue(), reading.getTime().getYear()) * reading.getQuantity();
	    // then
		Assertions.assertThat(baseCharge).isCloseTo(1.8, Offset.offset(0.1));
	}
}
