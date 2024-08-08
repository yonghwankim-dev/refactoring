package com.nemo.refactoring.ch06.class01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Owing {

	private final LocalDateFactory factory;

	public Owing(LocalDateFactory factory) {
		this.factory = factory;
	}

	public String statement(Invoice invoice){
		int outstanding = 0;
		StringBuilder builder = new StringBuilder();
		builder.append(banner());

		// calculate outstanding
		for (Order order : invoice.getOrders()) {
			outstanding += order.getAmount();
		}

		// store detailed owing information
		builder.append(detailed(invoice, outstanding));
		return builder.toString();
	}

	private String banner() {
		return "************************" + "\n"
			+ "**** customer owing ****" + "\n"
			+ "************************" + "\n" + "\n";
	}

	private String detailed(Invoice invoice, int outstanding) {
		LocalDate dueDate = factory.now().plusDays(30);
		return "customer: " + invoice.getCustomer() + "\n"
			+ "amount: " + usd(outstanding) + "\n"
			+ "due date: " + isoLocal(dueDate) + "\n";
	}

	private String usd(double value) {
		return String.format("$%,.2f", value);
	}

	private String isoLocal(LocalDate localDate) {
		return localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
	}
}
