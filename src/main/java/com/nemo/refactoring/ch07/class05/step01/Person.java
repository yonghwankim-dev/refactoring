package com.nemo.refactoring.ch07.class05.step01;

public class Person {
	private String name;
	private String officeAreaCode;
	private String officeNumber;
	private TelephoneNumber telephoneNumber;

	public Person(String name, String officeAreaCode, String officeNumber) {
		this.name = name;
		this.officeAreaCode = officeAreaCode;
		this.officeNumber = officeNumber;
		this.telephoneNumber = new TelephoneNumber(officeAreaCode, officeNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficeAreaCode() {
		return officeAreaCode;
	}

	public void setOfficeAreaCode(String officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public String telephoneNumber() {
		return ("(" + officeAreaCode + ") " + officeNumber);
	}
}
