package com.nemo.refactoring.ch11.class08;

public class Employee {
	enum TypeCode {
		ENGINEER, SALESMAN, MANAGER;
	}

	private final String name;
	private final TypeCode typeCode;

	public Employee(String name, TypeCode typeCode) {
		this.name = name;
		this.typeCode = typeCode;
	}
}
