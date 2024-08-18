package com.nemo.refactoring.ch08.class07;

import java.util.List;

public class Calculator {
	// 전체 급여와 가장 나이가 적은 값을 계산한다
	public String calculateYoungestAndTotalSalary(List<Person> people) {
		int youngest = people.get(0) != null ? people.get(0).getAge() : Integer.MAX_VALUE;
		for (Person person : people) {
			if (person.getAge() < youngest) {
				youngest = person.getAge();
			}
		}

		int totalSalary = 0;
		for (Person person : people) {
			totalSalary += person.getSalary();
		}
		return String.format("youngest: %d, totalSalary: %d", youngest, totalSalary);
	}
}
