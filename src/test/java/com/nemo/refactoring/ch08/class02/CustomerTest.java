package com.nemo.refactoring.ch08.class02;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {

	@DisplayName("사용자는 손님의 할인을 적용한다")
	@Test
	void applyDiscount(){
	    // given
		Customer kim = new Customer("kim", 0.5);
		// when
		int result = kim.applyDiscount(1000);
		// then
		Assertions.assertThat(result).isEqualTo(500);
	}

}
