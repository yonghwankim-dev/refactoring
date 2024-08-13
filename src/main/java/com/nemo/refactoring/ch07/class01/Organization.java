package com.nemo.refactoring.ch07.class01;

import java.util.HashMap;
import java.util.Map;

public class Organization {

	private Map<String, String> data;

	public Organization(Map<String, String> data) {
		this.data = data;
	}



	public static void main(String[] args) {
		Organization organization = new Organization(Map.of("name", "Acme Gooseberries", "country", "US"));

		System.out.println(organization.data.get("name")); // read example
		String newName = "Acme Gooseberries, Inc.";
		organization.data.put("name", newName); // write example
		System.out.println(organization.data);
	}
}
