package com.nemo.refactoring.ch10.class05.step01;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SiteTest {
	@DisplayName("고객이 거주하는 공간(site)에 고객이 미확인 고객이면 고객 이름을 거주자로 변경한다")
	@Test
	void changeCustomerNameToResident_WhenCustomerIsUnidentifiedAndResidingInSite(){
	    // given
		Site site = new Site(new Customer("미확인 고객"));
		Customer customer = site.getCustomer();
		// when
		String customerName;
		if (customer.getName().equals("미확인 고객")){
			customerName = "거주자";
		}else{
			customerName = customer.getName();
		}
	    // then
		Assertions.assertThat(customerName).isEqualTo("거주자");
	}

	@DisplayName("거주하는 공간의 고객이 미확인 고객은 기본 요금으로 계산한다")
	@Test
	void calculateDefaultRate_WhenCustomerIsUnidentifiedInSite(){
	    // given
		Registry registry = new Registry(List.of(new Plan("basic", 100)));
		Site site = new Site(new Customer("미확인 고객"));
		Customer customer = site.getCustomer();
	    // when
		Plan plan = null;
		if (customer.getName().equals("미확인 고객")){
			plan = registry.basic();
		}else{
			plan = customer.billingPlan();
		}
	    // then
		Assertions.assertThat(plan).isEqualTo(new Plan("basic", 100));
	}
}
