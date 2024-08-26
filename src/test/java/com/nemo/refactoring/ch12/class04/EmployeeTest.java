package com.nemo.refactoring.ch12.class04;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@DisplayName("회비를 말한다")
	@Test
	void sayQuota() {
		// given
		Employee employee = new Engineer(100);
		// when
		int result = employee.sayQuota();
		// then
		Assertions.assertThat(result).isEqualTo(200);
	}

}
