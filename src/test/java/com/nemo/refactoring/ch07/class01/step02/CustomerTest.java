package com.nemo.refactoring.ch07.class01.step02;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {

	@DisplayName("사용자는 고객 정보를 작성한다")
	@Test
	void test1(){
	    // given
		Map<String, Map<String, Object>> customerData = new HashMap<>();
		Map<String, Object> martin = new HashMap<>();
		Map<String, Map<String, Integer>> martinUsages = new HashMap<>();
		Map<String, Integer> martinMonthlyUsage = new HashMap<>();
		int value = 50;
		for (int i = 1; i <= 12; i++){
			martinMonthlyUsage.put(String.valueOf(i), value);
			value += 5;
		}
		martinUsages.put("2016", martinMonthlyUsage);
		martinUsages.put("2015", martinMonthlyUsage);

		martin.put("name", "Martin");
		martin.put("id", "1920");
		martin.put("usages", martinUsages);
		customerData.put("1920", martin);
	    // when
		String customerId = "1920";
		Map<String, Map<String, Integer>> usages = (Map<String, Map<String, Integer>>)customerData.get(customerId).get("usages");
		int year = 2016;
		int month = 1;
		int amount = 10;
		usages.get(String.valueOf(year)).put(String.valueOf(month), amount);
	    // then
		Integer findAmount = usages.get(String.valueOf(year)).get(String.valueOf(month));
		Assertions.assertThat(findAmount).isEqualTo(10);
	}

}
