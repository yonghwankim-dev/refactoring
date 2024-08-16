package com.nemo.refactoring.ch07.class07.step01;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class PersonTest {

	@DisplayName("사용자는 사람의 이름과 부서를 출력한다")
	@Test
	void personInfo(){
	    // given
		Person kim = new Person("kim", "HR001", "Alice");
		// when
		String personInfo = kim.getName() + " " + kim.getDepartment().getChargeCode() + " " + kim.getDepartment().getManager();
	    // then
		Assertions.assertThat(personInfo).isEqualTo("kim HR001 Alice");
	}

}
