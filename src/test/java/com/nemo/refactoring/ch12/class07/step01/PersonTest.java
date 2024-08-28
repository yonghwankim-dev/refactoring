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
		long count = people.stream().filter(Person::isMale).count();
		// then
		Assertions.assertThat(count).isEqualTo(2);
	}

	@DisplayName("이름과 성별을 전달하여 객체를 생성한다")
	@Test
	void createPerson() {
		// given
		String name = "kim";
		String gender = "M";
		// when
		Person person = Person.createPerson(name, gender);
		// then
		Assertions.assertThat(person).isInstanceOf(Person.class);
	}
}
