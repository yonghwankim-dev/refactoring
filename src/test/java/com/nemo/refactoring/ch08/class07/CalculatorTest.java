package com.nemo.refactoring.ch08.class07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@DisplayName("사람들중 최연소와 총 급여를 계산한다")
	@Test
	void calculateYoungestAndTotalSalary(){
	    // given
		Calculator calculator = new Calculator();
		List<Person> people = List.of(
				new Person("kim", 18, 28000000),
				new Person("lee", 19, 30000000),
				new Person("park", 20, 35000000)
		);
		// when
		String result = calculator.calculateYoungestAndTotalSalary(people);
		// then
		Assertions.assertThat(result).isEqualTo("youngest: 18, totalSalary: 93000000");
	}

}
