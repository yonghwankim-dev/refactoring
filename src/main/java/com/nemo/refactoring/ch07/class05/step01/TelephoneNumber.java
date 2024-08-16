package com.nemo.refactoring.ch07.class05.step01;

public class TelephoneNumber {
	private String officeAreaCode;
	private String officeNumber;

	public TelephoneNumber(String officeAreaCode, String officeNumber) {
		this.officeAreaCode = officeAreaCode;
		this.officeNumber = officeNumber;
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
}
