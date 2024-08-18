package com.nemo.refactoring.ch10.class04;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BirdAnalyzer {

	public Map<String, String> plumages(List<Bird> birds){
		return birds.stream()
			.collect(Collectors.toMap(Bird::getName, this::plumage));
	}

	private String plumage(Bird bird) {
		return switch (bird.getType()) {
			case "유럽 제비" -> "보통이다";
			case "아프리카 제비" -> bird.getNumberOfCoconuts() > 2 ? "지쳤다" : "보통이다";
			case "노르웨이 파란 앵무" -> bird.getVoltage() > 100 ? "그을렸다" : "예쁘다";
			default -> "unknown";
		};
	}

	public Map<String, Integer> speeds(List<Bird> birds){
		return birds.stream()
			.collect(Collectors.toMap(Bird::getName, this::airSpeedVelocity));
	}

	private Integer airSpeedVelocity(Bird bird) {
		switch (bird.getType()){
			case "유럽 제비" -> {
				return 35;
			}
			case "아프리카 제비" -> {
				return 40 - 2 * bird.getNumberOfCoconuts();
			}
			case "노르웨이 파란 앵무" -> {
				return bird.isNailed() ? 0 : 10 + bird.getVoltage() / 10;
			}
			default -> {
				return null;
			}
		}
	}
}
