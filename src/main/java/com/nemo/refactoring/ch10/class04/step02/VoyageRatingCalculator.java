package com.nemo.refactoring.ch10.class04.step02;

import java.util.List;

public class VoyageRatingCalculator {
	public String rating(Voyage voyage, List<Voyage> history) {
		int vpf = voyageProfitFactor(voyage, history);
		int vr = voyageRisk(voyage);
		int chr = captainHistoryRisk(voyage, history);
		if (vpf * 3 > (vr + chr * 2)){
			return "A";
		}
		return "B";
	}

	// 수익 요인
	private int voyageProfitFactor(Voyage voyage, List<Voyage> history) {
		int result = 2;
		if (voyage.getZone().equals("중국")){
			result += 1;
		}
		if (voyage.getZone().equals("동인도")){
			result += 1;
		}
		if (voyage.getZone().equals("중국") && hasChina(history)){
			result += 3;
			if (history.size() > 10){
				result += 1;
			}
			if (voyage.getLength() > 12){
				result += 1;
			}
			if (voyage.getLength() > 18){
				result -= 1;
			}
		}else{
			if (history.size() > 8){
				result += 1;
			}
			if (history.size() > 14){
				result -= 1;
			}
		}
		return result;
	}

	private boolean hasChina(List<Voyage> history) {
		return history.stream()
				.anyMatch(v -> v.getZone().equals("중국"));
	}

	private int voyageRisk(Voyage voyage) {
		return 1;
	}

	private int captainHistoryRisk(Voyage voyage, List<Voyage> history) {
		return 1;
	}
}
