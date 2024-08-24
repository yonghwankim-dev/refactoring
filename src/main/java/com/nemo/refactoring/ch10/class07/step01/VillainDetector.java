package com.nemo.refactoring.ch10.class07.step01;

import java.util.List;

public class VillainDetector {
	public boolean checkForMiscreants(List<String> people) {
		boolean found = false;
		for (String p : people){
			if (!found){
				if (p.equals("jocker")){
					sendAlert();
					found = true;
				}
				if (p.equals("saruman")){
					sendAlert();
					found = true;
				}
			}
		}
		return found;
	}

	private void sendAlert() {
		System.out.println("alert villain!!");
	}
}
