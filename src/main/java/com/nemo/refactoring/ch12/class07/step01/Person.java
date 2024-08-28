package com.nemo.refactoring.ch12.class07.step01;

public class Person {
	private final String name;

	public Person(String name) {
		this.name = name;
	}

	public static Person createMale(String name) {
		return new Male(name);
	}

	public static Person createFemale(String name) {
		return new Female(name);
	}

	public static Person createPerson(String name) {
		return new Person(name);
	}

	public static Person createPerson(String name, String gender) {
		return switch (gender) {
			case "M" -> createMale(name);
			case "F" -> createFemale(name);
			default -> createPerson(name);
		};
	}

	public String getName() {
		return name;
	}

	public String genderCode() {
		return "X";
	}
}
