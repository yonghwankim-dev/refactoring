package com.nemo.refactoring.ch06.class01;


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
		builder.append("customer: BigCo").append("\n");
		builder.append("amount: $1,000.00").append("\n");
		builder.append("due date: 2024-12-31").append("\n");
		return builder.toString();
	}
}
