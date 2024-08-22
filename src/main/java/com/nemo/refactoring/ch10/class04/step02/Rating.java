package com.nemo.refactoring.ch10.class04.step02;

import java.util.List;

public class Rating {
	private final Voyage voyage;
	private final List<VoyageHistory> history;

	public Rating(Voyage voyage, List<VoyageHistory> history) {
		this.voyage = voyage;
		this.history = history;
	}

	public String value() {
		int vpf = voyageProfitFactor();
		int vr = voyageRisk();
		int chr = captainHistoryRisk();
		if (vpf * 3 > (vr + chr * 2)){
			return "A";
		}
		return "B";
	}

	// 수익 요인
	private int voyageProfitFactor() {
		int result = 2;
		if (voyage.getZone().equals("중국")){
			result += 1;
		}
		if (voyage.getZone().equals("동인도")){
			result += 1;
		}
		if (voyage.getZone().equals("중국") && hasChinaHistory()){
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

	private boolean hasChinaHistory() {
		return history.stream()
			.map(VoyageHistory::getZone)
			.anyMatch(zone -> zone.equals("중국"));
	}

	// 항해 경로 위험요소
	private int voyageRisk() {
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
	private int captainHistoryRisk() {
		int result = 1;
		if (history.size() < 5){
			result += 4;
		}
		result += (int)history.stream().filter(v->v.getProfit() < 0).count();
		if (voyage.getZone().equals("중국") && hasChinaHistory()){
			result -= 2;
		}
		return Math.max(result, 0);
	}
}
