package com.nemo.refactoring.ch10.class05.step01;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SiteTest {
	@DisplayName("알려지지 않은 고객의 이름을 거주자로 변경한다")
	@Test
	void testCustomerName(){
		Customer customer = new Customer("미확인 고객");
		String customerName;

		if (customer.getName().equals("미확인 고객")){
			customerName = "거주자";
		}else{
			customerName = customer.getName();
		}
		Assertions.assertThat(customerName).isEqualTo("거주자");
	}

	@DisplayName("고객의 이름이 미확인 고객이면 기본 요금제로 계산한다")
	@Test
	void testBillingPlan(){
	    // given
		Customer customer = new Customer("미확인 고객");
		Registry registry = new Registry();
		// when
	    String plan = customer.getName().equals("미확인 고객") ? registry.billingPlans().basic() : customer.billingPlan().getName();
	    // then
		Assertions.assertThat(plan).isEqualTo("basic");
	}

	@DisplayName("미확인 고객이 아닌 고객은 새로운 plan을 저장한다")
	@Test
	void testNewPlan(){
	    // given
		Customer customer = new Customer("kim");
		// when
	    if (!customer.getName().equals("미확인 고객")){
			customer.setBillingPlan(new BillingPlan("newPlan"));
		}
	    // then
		Assertions.assertThat(customer.billingPlan().getName()).isEqualTo("newPlan");
	}

	@DisplayName("미확인 고객인 경우 지연 주간 수는 0이다")
	@Test
	void testWeeksDelinquent(){
	    // given
		Customer customer = new Customer("미확인 고객");
	    // when
		int weeksDelinquent = customer.getName().equals("미확인 고객") ? 0 : customer.paymentHistory().weeksDelinquentInLastYear();
	    // then
		Assertions.assertThat(weeksDelinquent).isZero();
	}
}
