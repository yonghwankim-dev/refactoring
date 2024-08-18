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
		return bird.plumage();
	}

	public Map<String, Integer> speeds(List<Bird> birds){
		return birds.stream()
			.collect(Collectors.toMap(Bird::getName, this::airSpeedVelocity));
	}

	private Integer airSpeedVelocity(Bird bird) {
		return bird.airSpeedVelocity();
	}
}
