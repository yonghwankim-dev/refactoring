package com.nemo.refactoring.ch12.class08.step01;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DepartmentTest {

	@DisplayName("부서의 연간 비용을 계산한다")
	@Test
	void getTotalAnnualCost() {
		// given
		Department department = new Department("인사부", List.of(
			new Employee("회사원A", 1, 100),
			new Employee("회사원B", 2, 200),
			new Employee("회사원C", 3, 300)
		));
		// when
		int cost = department.getTotalAnnualCost();
		// then
		Assertions.assertThat(cost).isEqualTo((1200 + 2400 + 3600) * 12);
	}

}
