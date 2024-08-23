package com.nemo.refactoring.ch10.class05.step02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SiteTest {
	@DisplayName("고객이 거주하는 공간(site)에 고객이 미확인 고객이면 고객 이름을 거주자로 변경한다")
	@Test
	void changeCustomerNameToResident_WhenCustomerIsUnidentifiedAndResidingInSite(){
	    // given
		Site site = new Site(new Customer(true, "미확인 고객", new Plan("요금제", 50), new PaymentHistory(false, 0)));
		Customer customer = site.getCustomer();
		// when
		String customerName = customer.getName();
	    // then
		Assertions.assertThat(customerName).isEqualTo("거주자");
	}

	private boolean isUnknown(Customer customer) {
		return customer.getName().equals("미확인 고객");
	}

	@DisplayName("거주하는 공간의 고객이 미확인 고객은 기본 요금으로 계산한다")
	@Test
	void calculateDefaultRate_WhenCustomerIsUnidentifiedInSite(){
	    // given
		Site site = new Site(Customer.create("미확인 고객"));
		Customer customer = site.getCustomer();
		// when
		Plan plan = customer.getBillingPlan();
	    // then
		Assertions.assertThat(plan).isEqualTo(new Plan("basic", 100));
	}

	@DisplayName("고객이 미확인 고객이 아닌 고객은 새로운 요금제를 설정한다")
	@Test
	void SetNewRatePlan_WhenCustomerIsIdentified(){
	    // given
		Site site = new Site(new Customer(false, "kim", new Plan("요금제", 50), new PaymentHistory(false, 0)));
		Customer customer = site.getCustomer();
	    // when
		if (!isUnknown(customer)){
			customer.setBillingPlan(new Plan("special", 200));
		}
	    // then
		Assertions.assertThat(customer.getBillingPlan()).isEqualTo(new Plan("special", 200));
	}

	@DisplayName("고객이 미확인 고객이면 지연 주수가 0이고 미확인 고객이 아니면 히스토리를 통해서 지연 주수를 계산한다")
	@Test
	void calculateDelayWeeks_WhenCustomerIsIdentifiedOrSetToZeroIfUnidentified(){
	    // given
		Site site = new Site(new Customer(false, "kim", new Plan("요금제", 50), new PaymentHistory(true, 2)));
		Customer customer = site.getCustomer();
	    // when
		int weeksDelinquent;
		if (isUnknown(customer)){
			weeksDelinquent = 0;
		}else{
			weeksDelinquent = customer.getPaymentHistory().getWeeksDelinquentInLastYear();
		}
	    // then
		Assertions.assertThat(weeksDelinquent).isEqualTo(2);
	}

	@DisplayName("미확인 고객의 지연 주수는 0이다")
	@Test
	void calculateWeeksDelinquent_WhenCustomerIsIdentified(){
		// given
		Site site = new Site(new Customer(true, "미확인 고객", new Plan("요금제", 50), new PaymentHistory(true, 2)));
		Customer customer = site.getCustomer();
		// when
		int weeksDelinquent = 0;
		if (!isUnknown(customer)){
			weeksDelinquent = customer.getPaymentHistory().getWeeksDelinquentInLastYear();
		}
		// then
		Assertions.assertThat(weeksDelinquent).isZero();
	}
}
