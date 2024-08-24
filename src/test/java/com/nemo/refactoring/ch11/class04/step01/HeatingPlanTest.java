package com.nemo.refactoring.ch11.class04.step01;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HeatingPlanTest {

	@DisplayName("bottom과 top의 범위가난방 계획 범위 안에 있는다")
	@Test
	void withinRange(){
	    // given
		HeatingPlan heatingPlan = new HeatingPlan(new TemperatureRange(20, 30));
		int bottom = 25;
		int top = 27;
		// when
		boolean withinRange = heatingPlan.withinRange(bottom, top);
		// then
		Assertions.assertThat(withinRange).isTrue();
	}
}
