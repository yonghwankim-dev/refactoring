package com.nemo.refactoring.ch10.class02;

public class DisabilityCalculator {
	public int disabilityAmount(Employee employee){
		if (employee.getSeniority() < 2){
			return 0;
		}
		if (employee.getMonthsDisabled() > 12){
			return 0;
		}
		if (employee.isPartTime()){
			return 0;
		}
		return 1000;
	}
}
