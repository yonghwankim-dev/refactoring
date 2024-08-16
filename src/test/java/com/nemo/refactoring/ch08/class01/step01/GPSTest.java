package com.nemo.refactoring.ch08.class01.step01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GPSTest {

	@DisplayName("사용자는 GPS의 추적 요약을 출력한다")
	@Test
	void trackSummary(){
	    // given
		List<Point> points = List.of(new Point(1, 1), new Point(2, 2), new Point(3, 3));
		GPS gps = new GPS(points);
		// when
		Track track = gps.trackSummary();
		// then
		Assertions.assertThat(track.getTime()).isEqualTo(3600);
		Assertions.assertThat(track.getDistance()).isCloseTo(24429.45, Offset.offset(0.1));
		Assertions.assertThat(track.getPace()).isCloseTo(0.002, Offset.offset(0.001));
	}

}
