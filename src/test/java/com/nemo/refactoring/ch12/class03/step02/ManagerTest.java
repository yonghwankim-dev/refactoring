package com.nemo.refactoring.ch12.class03.step02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ManagerTest {

	@DisplayName("매니저의 차를 말한다")
	@Test
	void sayMyCar() {
		// given
		Manager manager = new Manager("kim", 4);
		// when
		String result = manager.sayMyCar();
		// then
		Assertions.assertThat(result).isEqualTo("my car is k3");
	}

}
