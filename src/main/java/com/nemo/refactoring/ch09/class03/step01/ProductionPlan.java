package com.nemo.refactoring.ch09.class03.step01;

import java.util.List;

public class ProductionPlan {
	private int production;
	private List<Adjustment> adjustments;

	public ProductionPlan(int production, List<Adjustment> adjustments) {
		this.production = production;
		this.adjustments = adjustments;
	}

	public void applyAdjustment(Adjustment adjustment) {
		this.adjustments.add(adjustment);
		this.production += adjustment.getAmount();
	}

	public int getProduction() {
		return production;
	}

	public List<Adjustment> getAdjustments() {
		return adjustments;
	}
}
