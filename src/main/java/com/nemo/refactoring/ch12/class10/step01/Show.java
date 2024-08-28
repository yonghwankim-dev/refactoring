package com.nemo.refactoring.ch12.class10.step01;

import java.util.List;

public class Show {

	private final List<String> owns;

	public Show(List<String> owns) {
		this.owns = owns;
	}

	public boolean hasOwnProperty(String property) {
		return owns.contains(property);
	}
}
