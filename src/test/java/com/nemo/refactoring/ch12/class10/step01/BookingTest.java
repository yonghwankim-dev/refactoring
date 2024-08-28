package com.nemo.refactoring.ch12.class10.step01;

import java.time.LocalDate;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BookingTest {

	@DisplayName("토크백이 있는지 계산한다")
	@Test
	void hasTalkback() {
		// given
		Show show = new Show(List.of("talkback"));
		Booking booking = new Booking(show, LocalDate.now());
		// when
		boolean result = booking.hasTalkback();
		// then
		Assertions.assertThat(result).isEqualTo(true);
	}

}
