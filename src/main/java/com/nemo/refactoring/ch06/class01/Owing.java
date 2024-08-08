package com.nemo.refactoring.ch06.class01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Owing {

	public String statement(Invoice invoice){
		int outstanding = 0;
		StringBuilder builder = new StringBuilder();
		builder.append("************************").append("\n");
		builder.append("**** customer owing ****").append("\n");
		builder.append("************************").append("\n").append("\n");

		// calculate outstanding
		for (Order order : invoice.getOrders()) {
			outstanding += order.getAmount();
		}

		// record due date
		// store detailed owing information
		builder.append("customer: ").append(invoice.getCustomer()).append("\n");
		builder.append("amount: ").append(usd(outstanding)).append("\n");
		builder.append("due date: ").append(isoLocal(invoice.getDueDate())).append("\n");
		return builder.toString();
	}

	private String usd(double value) {
		return String.format("$%,.2f", value);
	}

	private String isoLocal(LocalDate localDate) {
		return localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
	}
}
