package com.nemo.refactoring.ch06.class09;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReadingTest {
	@DisplayName("calculate TaxableCharge for Reading")
	@Test
	void calculateTaxableCharge(){
		// given
		Reading reading = new Reading("kim", 10, LocalDate.of(2024, 8, 9));
		// when
		double taxableCharge = reading.calculateTaxableCharge();
		// then
		Assertions.assertThat(taxableCharge).isCloseTo(1.6, Offset.offset(0.1));
	}
}
