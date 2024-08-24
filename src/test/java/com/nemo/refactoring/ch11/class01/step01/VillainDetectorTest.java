package com.nemo.refactoring.ch11.class01.step01;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VillainDetectorTest {

	@DisplayName("jocker는 빌런 탐색기에 발견되어 알람을 울린다")
	@Test
	void checkForMiscreants(){
	    // given
		VillainDetector detector = new VillainDetector();
		List<String> people = List.of("jocker", "poisonivy", "mario");
		// when
		String villain = detector.findMiscreant(people);
		detector.alertForMiscreant(people);
		// then
		Assertions.assertThat(villain).isEqualTo("jocker");
	}

}
