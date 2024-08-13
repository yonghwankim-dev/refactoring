package com.nemo.refactoring.ch06.class11.step02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.databind.ObjectMapper;

public class OrderReader {
	public static void main(String[] args) {
		try {
			if (args.length == 0) {
				throw new RuntimeException("input the file name.");
			}
			String fileName = args[args.length - 1];
			File input = new ClassPathResource(fileName).getFile();
			ObjectMapper mapper = new ObjectMapper();
			Order[] orders = mapper.readValue(input, Order[].class);
			if (Stream.of(args).anyMatch(arg-> "-r".equals(arg))){
				System.out.println(Stream.of(orders)
					.filter(o->"ready".equals(o.getStatus()))
					.count()); // 2
			}else{
				System.out.println(orders.length);
			}
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}
}
