package com.nemo.refactoring.ch12.class07.step01;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {

	@DisplayName("남자의 명수를 계산한다")
	@Test
	void testMaleCount() {
		// given
		List<Person> people = List.of(new Male("kim"), new Female("lee"), new Male("park"));
		// when
		long count = people.stream().filter(p -> p instanceof Male).count();
		// then
		Assertions.assertThat(count).isEqualTo(2);
	}
}
