package com.nemo.refactoring.ch08.class01.step02;

public class Account {

	enum AccountType {
			PREMIUM, NORMAL;

			public boolean isPremium() {
				return this == PREMIUM;
			}
	}

	private int daysOverdrawn; // 마이너스 잔액일 된 일수
	private AccountType type;

	public Account(int daysOverdrawn, AccountType type) {
		this.daysOverdrawn = daysOverdrawn;
		this.type = type;
	}

	public double bankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0) {
			result += overdraftCharge();
		}
		return result;
	}

	// 초과 인출 이자 계산
	private double overdraftCharge() {
		if (this.type.isPremium()) {
			double baseCharge = 10;
			if (daysOverdrawn <= 7) {
				return baseCharge;
			}
			return baseCharge + (daysOverdrawn - 7) * 0.85;
		}else{
			return daysOverdrawn * 1.75;
		}
	}
}
