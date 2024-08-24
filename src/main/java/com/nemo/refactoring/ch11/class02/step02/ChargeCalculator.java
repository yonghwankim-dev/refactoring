package com.nemo.refactoring.ch11.class02.step02;

public class ChargeCalculator {
	public int baseCharge(int usage) {
		if (usage < 0) {
			return usd(0);
		}
		int amount = (int)(withinBand(usage, 0, 100) * 0.03)
			+ (int)(withinBand(usage, 100, 200) * 0.05)
			+ (int)(topBand(usage) * 0.07);
		return usd(amount);
	}

	private int withinBand(int usage, int bottom, int top) {
		return usage > bottom ? Math.min(usage, top) - bottom : 0;
	}

	private int topBand(int usage) {
		return usage > 200 ? usage - 200 : 0;
	}

	private int usd(int value) {
		return value * 1000;
	}
}
