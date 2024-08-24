package com.nemo.refactoring.ch11.class03.step01;

import java.time.LocalDate;

public class Delivery {
	public LocalDate deliveryDate(Order order, boolean isRush){
		return LocalDate.now().plusDays(1);
	}
}
