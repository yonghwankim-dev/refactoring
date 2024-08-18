package com.nemo.refactoring.ch10.class04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BirdAnalyzerTest {

	@DisplayName("새들을 보고 깃털 상태를 판단한다")
	@Test
	void plumages(){
	    // given
		List<Bird> birds = List.of(new Bird("빨간 유럽 제비", "유럽 제비", 10, 100, true));
		// when
		Map<String, String> result = new BirdAnalyzer().plumages(birds);
		// then
		Assertions.assertThat(result.getOrDefault("빨간 유럽 제비", null)).isEqualTo("보통이다");
	}


	@DisplayName("새들을 보고 비행속도를 판단한다")
	@Test
	void speeds(){
		// given
		List<Bird> birds = List.of(new Bird("빨간 유럽 제비", "유럽 제비", 10, 100, true));
		// when
		Map<String, Integer> result = new BirdAnalyzer().speeds(birds);
		// then
	    Assertions.assertThat(result.getOrDefault("빨간 유럽 제비", 0)).isEqualTo(35);
	}
}
