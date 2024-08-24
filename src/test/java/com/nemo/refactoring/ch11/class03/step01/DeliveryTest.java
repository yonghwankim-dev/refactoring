package com.nemo.refactoring.ch11.class03.step01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DeliveryTest {

	@DisplayName("빠른 배송을 선택한 주문에 대해서는 일반 주문보다 빠른 일자로 받을 수 있다")
	@Test
	void deliveryDate(){
	    // given
		Delivery delivery = new Delivery();
		Order order = new Order();
		boolean isRush = true;
		// when
		LocalDate deliveryDate = delivery.deliveryDate(order, isRush);
		// then
		LocalDate expectedDeliveryDate = LocalDate.now().plusDays(1);
		Assertions.assertThat(deliveryDate).isAfterOrEqualTo(expectedDeliveryDate);
	}

}
