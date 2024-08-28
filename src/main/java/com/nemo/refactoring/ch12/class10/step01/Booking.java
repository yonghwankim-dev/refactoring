package com.nemo.refactoring.ch12.class10.step01;

import java.time.LocalDate;

public class Booking {
	private final Show show;
	private final LocalDate date;

	public Booking(Show show, LocalDate date) {
		this.show = show;
		this.date = date;
	}

	public boolean hasTalkback() {
		return this.show.hasOwnProperty("talkback") && !this.isPeakDay();
	}

	private boolean isPeakDay() {
		return false;
	}
}
