package com.nemo.refactoring.ch12.class10.step01;

import java.time.LocalDate;
import java.util.List;

public class PremiumBooking extends Booking {
	private final List<Extra> extras;

	public PremiumBooking(Show show, LocalDate date, List<Extra> extras) {
		super(show, date);
		this.extras = extras;
	}
}
