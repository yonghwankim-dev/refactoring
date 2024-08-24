package com.nemo.refactoring.ch11.class04.step02;

public class Main {
	public static void main(String[] args) {
		Room room = new Room(new TemperatureRange(19, 20));
		int low = room.getDaysTempRange().getLow();
		int high = room.getDaysTempRange().getHigh();
		HeatingPlan heatingPlan = new HeatingPlan(new TemperatureRange(20, 30));
		if (!heatingPlan.withinRange(low, high)){
			System.out.println("방 온도가 지정 범위를 벗어났습니다.");
		}
	}
}
