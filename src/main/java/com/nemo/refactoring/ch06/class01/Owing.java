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
		return """
			************************
			**** customer owing ****
			************************

			""";
	}

	private String detailed(Invoice invoice, int outstanding) {
		return "customer: " + invoice.getCustomer() + "\n"
			+ "amount: " + usd(outstanding) + "\n"
			+ "due date: " + isoLocal(recordDueDate()) + "\n";
	}

	private LocalDate recordDueDate() {
		return factory.now().plusDays(30);
	}

	private String usd(double value) {
		return String.format("$%,.2f", value);
	}

	private String isoLocal(LocalDate localDate) {
		return localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
	}
}
