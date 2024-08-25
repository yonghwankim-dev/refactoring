package com.nemo.refactoring.ch11.class06.step01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HeatingPlanTest {

	@DisplayName("온도를 설정하지만 목표 온도는 난방 계획 안에 존재한다")
	@Test
	void targetTemperature() {
		// given
		HeatingPlan heatingPlan = new HeatingPlan();
		// when
		int temperature = heatingPlan.targetTemperature();
		// then
		Assertions.assertThat(temperature).isEqualTo(0);
	}

}
