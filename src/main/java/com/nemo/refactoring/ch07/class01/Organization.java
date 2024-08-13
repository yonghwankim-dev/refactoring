package com.nemo.refactoring.ch07.class01;

import java.util.HashMap;
import java.util.Map;

public class Organization {

	private static final Map<String, String> organization = new HashMap<>();


	public static void main(String[] args) {
		organization.put("name", "Acme Gooseberries");
		organization.put("country", "US");

		System.out.println(getRawDataOfOrganization().get("name")); // read example
		String newName = "Acme Gooseberries, Inc.";
		getRawDataOfOrganization().put("name", newName); // write example
		System.out.println(getRawDataOfOrganization());
	}

	public static Map<String, String> getRawDataOfOrganization() {
		return organization;
	}
}
