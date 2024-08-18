package com.nemo.refactoring.ch08.class08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.util.Strings;

public class OfficeCsvReader {
	public List<Office> readOffices(String input) {
		String[] lines = input.split("\n");
		return Arrays.stream(lines)
			.skip(1)
			.filter(line -> !line.trim().equals(Strings.EMPTY))
			.map(line -> line.split(","))
			.filter(record -> record[1].trim().equals("India"))
			.map(record -> new Office(record[0].trim(), record[1].trim(), record[2].trim()))
			.toList();
	}
}
