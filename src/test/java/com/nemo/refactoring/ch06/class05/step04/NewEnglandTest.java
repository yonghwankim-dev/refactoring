package com.nemo.refactoring.ch06.class05.step04;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NewEnglandTest {

	@DisplayName("customer is contained in NewEngland")
	@Test
	void isNewEngland(){
	    // given
		Customer customer1 = new Customer("John Doe", new Address("RI"));
		Customer customer2 = new Customer("Bob", new Address("AA"));
		Customer customer3 = new Customer("Smith", new Address("CT"));
		List<Customer> customers = List.of(customer1, customer2, customer3);
		NewEngland newEngland = new NewEngland();
		// when
		List<Customer> newEnglanders = customers.stream()
			.filter(newEngland::isNewEngland)
			.toList();
		// then
		Assertions.assertThat(newEnglanders)
			.hasSize(2)
			.extracting(Customer::getName)
			.containsExactlyInAnyOrder("John Doe", "Smith");
	}
}
