package com.nemo.refactoring.ch12.class10.step01;

import java.time.LocalDate;
import java.util.List;

public class Booking {
	final Show show;
	final LocalDate date;

	private PremiumBookingDelegate premiumDelegate;

	public Booking(Show show, LocalDate date) {
		this.show = show;
		this.date = date;
	}

	public static Booking createBooking(Show show, LocalDate date) {
		return new Booking(show, date);
	}

	public static PremiumBooking createPremiumBooking(Show show, LocalDate date, List<Extra> extras) {
		PremiumBooking result = new PremiumBooking(show, date, extras);
		result.bePremium(extras);
		return result;
	}

	void bePremium(List<Extra> extras) {
		this.premiumDelegate = new PremiumBookingDelegate(this, extras);
	}

	public boolean hasTalkback() {
		return this.premiumDelegate != null ? this.premiumDelegate.hasTalkback() :
			this.show.hasOwnProperty("talkback") && !this.isPeakDay();
	}

	// date가 7월 1일 ~ 8월 1일 사이인지 여부 검사
	boolean isPeakDay() {
		// 7월 1일
		LocalDate start = LocalDate.of(date.getYear(), 7, 1);
		// 8월 31일
		LocalDate end = LocalDate.of(date.getYear(), 8, 31);

		// 주어진 날짜가 7월 1일 이후이고, 8월 31일 이전이거나 같은지 확인
		return (date.isEqual(start) || date.isAfter(start)) && (date.isEqual(end) || date.isBefore(end));
	}

	public int calculateBasePrice() {
		int result = this.show.getPrice();
		if (this.isPeakDay()) {
			result += (int)Math.round(result * 0.15);
		}
		return result;
	}

	public PremiumBookingDelegate getPremiumDelegate() {
		return premiumDelegate;
	}
}
