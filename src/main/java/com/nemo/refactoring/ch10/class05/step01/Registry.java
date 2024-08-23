package com.nemo.refactoring.ch10.class05.step01;

import java.util.List;

public class Registry {
	private List<Plan> billingPlans;

	public Registry(List<Plan> billingPlans) {
		this.billingPlans = billingPlans;
	}

	public Plan basic(){
		return billingPlans.stream()
			.filter(p->p.getName().equals("basic"))
			.findAny()
			.orElse(null);
	}
}
