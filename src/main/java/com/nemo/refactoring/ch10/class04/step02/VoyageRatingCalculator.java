package com.nemo.refactoring.ch10.class04.step02;

import java.util.List;

public class VoyageRatingCalculator {
	public String rating(Voyage voyage, List<VoyageHistory> history) {
		int vpf = voyageProfitFactor(voyage, history);
		int vr = voyageRisk(voyage);
		int chr = captainHistoryRisk(voyage, history);
		if (vpf * 3 > (vr + chr * 2)){
			return "A";
		}
		return "B";
	}

	// 수익 요인
	private int voyageProfitFactor(Voyage voyage, List<VoyageHistory> history) {
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

	private boolean hasChina(List<VoyageHistory> history) {
		return history.stream()
				.anyMatch(v -> v.getZone().equals("중국"));
	}

	// 항해 경로 위험요소
	private int voyageRisk(Voyage voyage) {
		int result = 1;
		if(voyage.getLength() > 4){
			result += 2;
		}
		if (voyage.getLength() > 8){
			result += voyage.getLength() - 8;
		}
		List<String> zones = List.of("중국", "동인도");
		if (zones.contains(voyage.getZone())){
			result += 4;
		}
		return Math.max(result, 0);
	}

	// 선장의 항해 이력 위험요소
	private int captainHistoryRisk(Voyage voyage, List<VoyageHistory> history) {
		int result = 1;
		if (history.size() < 5){
			result += 4;
		}
		result += (int)history.stream().filter(v->v.getProfit() < 0).count();
		if (voyage.getZone().equals("중국") && hasChina(history)){
			result -= 2;
		}
		return Math.max(result, 0);
	}
}
