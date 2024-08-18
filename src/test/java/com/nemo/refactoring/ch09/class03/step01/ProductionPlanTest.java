package com.nemo.refactoring.ch09.class03.step01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductionPlanTest {

	@DisplayName("Adjustment 객체를 플랜 객체에 추가하고 production 값도 누적한다")
	@Test
	void applyAdjustment(){
	    // given
		ProductionPlan plan = new ProductionPlan(0, new ArrayList<>());
		// when
		plan.applyAdjustment(new Adjustment(1000));
	    // then
		Assertions.assertThat(plan.getProduction()).isEqualTo(1000);
		Assertions.assertThat(plan.getAdjustments().size()).isEqualTo(1);
	}

}
