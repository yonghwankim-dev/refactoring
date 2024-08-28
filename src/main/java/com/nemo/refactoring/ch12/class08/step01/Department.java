package com.nemo.refactoring.ch12.class08.step01;

import java.util.List;

public class Department {
	private final String name;
	private final List<Employee> employee;

	public Department(String name, List<Employee> employee) {
		this.name = name;
		this.employee = employee;
	}

	public int totalMonthlyCost() {
		return employee.stream()
			.mapToInt(Employee::getAnnualCost)
			.sum();
	}

	public int getHeadCount() {
		return employee.size();
	}

	public int getTotalAnnualCost() {
		return this.totalMonthlyCost() * 12;
	}

	public String getName() {
		return name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}
}
