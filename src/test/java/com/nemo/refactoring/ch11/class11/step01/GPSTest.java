package com.nemo.refactoring.ch11.class11.step01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GPSTest {

	@DisplayName("Ascent를 계산한다")
	@Test
	void calculateAscent() {
		// given
		Point[] points = new Point[] {new Point(3), new Point(4), new Point(5)};
		GPS gps = new GPS(points);
		// when
		int result = gps.calculateAscent();
		// then
		Assertions.assertThat(result).isEqualTo(2);
	}

}
