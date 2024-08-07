package com.nemo.refactoring.ch01.theater;

public class Performance {
	private final String playId;
	private final int audience;

	public Performance(String playId, int audience) {
		this.playId = playId;
		this.audience = audience;
	}

	public String getPlayId() {
		return playId;
	}

	public int getAudience() {
		return audience;
	}
}
