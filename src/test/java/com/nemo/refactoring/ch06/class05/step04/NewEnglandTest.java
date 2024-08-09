package com.nemo.refactoring.ch06.class05.step04;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NewEnglandTest {

	@DisplayName("customer is contained in NewEngland")
	@Test
	void isNewEngland(){
	    // given
		Customer customer = new Customer("John Doe", new Address("RI"));
		NewEngland newEngland = new NewEngland();
		// when
		boolean result = newEngland.isNewEngland(customer);
		// then
		Assertions.assertThat(result).isTrue();
	}
}
