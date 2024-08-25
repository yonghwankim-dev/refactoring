package com.nemo.refactoring.ch11.class08;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@DisplayName("직원 객체를 생성한다")
	@Test
	void instance() {
		// given
		String name = "kim";
		Employee.TypeCode typeCode = Employee.TypeCode.ENGINEER;
		// when
		Employee kim = new Employee(name, typeCode);
		// then
		Assertions.assertThat(kim).isNotNull();
	}
}
