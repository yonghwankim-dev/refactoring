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
		double baseCharge = Reading.calculateBaseCharge(reading);
	    // then
		Assertions.assertThat(baseCharge).isCloseTo(1.8, Offset.offset(0.1));
	}

	@DisplayName("calculate TaxableCharge for Reading")
	@Test
	void calculateTaxableCharge(){
		// given
		Reading reading = new Reading("kim", 10, LocalDate.of(2024, 8, 9));
		double baseCharge = Reading.calculateBaseCharge(reading);
		// when
		double taxableCharge = Math.max(0, baseCharge - Reading.taxThreshold(reading.getTime().getYear()));
		// then
		Assertions.assertThat(taxableCharge).isCloseTo(1.6, Offset.offset(0.1));
	}
}
