package com.nemo.refactoring.ch06.class05.step03;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Collectors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReservationTest {

	@DisplayName("add reservation with customer to the firstServedReservations queue")
	@Test
	void addReservation(){
	    // given
		Reservation reservation = new Reservation();
		Customer kim = new Customer("kim");
		Customer lee = new Customer("lee");
		Customer park = new Customer("park");
		// when
		reservation.addReservation(kim);
		reservation.addReservation(lee);
		reservation.addReservation(park);
	    // then
		String customerNames = reservation.getReservations().stream()
			.map(Customer::getName)
			.collect(Collectors.joining(", "));
		Assertions.assertThat(customerNames).isEqualTo("kim, lee, park");
	}
}
