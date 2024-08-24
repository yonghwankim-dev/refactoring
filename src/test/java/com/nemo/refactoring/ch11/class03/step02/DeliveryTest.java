package com.nemo.refactoring.ch11.class03.step02;


import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DeliveryTest {

	@DisplayName("MA 주에 배송해야 하는 빠른 주문은 주문 당일 기준 2일 후에 배송된다")
	@Test
	void deliveryDate(){
	    // given
		Delivery delivery = new Delivery();
		Order order = new Order("MA", LocalDate.now());
		boolean isRush = true;
		// when
		LocalDate deliveryDate = delivery.deliveryDate(order, isRush);
		// then
		LocalDate expectedDeliveryDate = LocalDate.now().plusDays(2);
		Assertions.assertThat(deliveryDate).isEqualTo(expectedDeliveryDate);
	}

}
