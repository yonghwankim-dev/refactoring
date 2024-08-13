package com.nemo.refactoring.ch06.class11.step02;

import java.io.File;
import java.nio.file.Paths;

public class OrderReader {
	public static void main(String[] args) {
		if (args.length == 0) {
			throw new RuntimeException("input the file name.");
		}
		String fileName = args[args.length - 1];
		File input = Paths.get(fileName).toFile();

	}
}
