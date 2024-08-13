package com.nemo.refactoring.ch07.class01;

import java.util.HashMap;
import java.util.Map;

public class Organization {

	public static void main(String[] args) {
		final Map<String, String> organization = new HashMap<>();
		organization.put("name", "Acme Gooseberries");
		organization.put("country", "US");

		System.out.println(organization.get("name")); // read example
		String newName = "Acme Gooseberries, Inc.";
		organization.put("name", newName); // write example
	}
}
