package com.nemo.refactoring.ch08.class08;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.util.Strings;

public class OfficeCsvReader {
	public List<Office> readOffices(String input) {
		String[] lines = input.split("\n");
		boolean firstLine = true;
		List<Office> result = new ArrayList<>();
		for (String line : lines) {
			if (firstLine) {
				firstLine = false;
				continue;
			}
			if (line.trim().equals(Strings.EMPTY)){
				continue;
			}
			String[] record = line.split(",");
			if (record[1].trim().equals("India")){
				result.add(new Office(record[0].trim(), record[1].trim(), record[2].trim()));
			}
		}
		return result;
	}
}
