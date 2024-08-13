package com.nemo.refactoring.ch06.class11.step02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.databind.ObjectMapper;

public class OrderReader {
	public static void main(String[] args) {
		try {
			OrderReader orderReader = new OrderReader();
			System.out.println(orderReader.run(args));
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}

	public long run(String[] args) throws IOException {
		if (args.length == 0) {
			throw new RuntimeException("input the file name.");
		}
		CommandLine commandLine = new CommandLine();
		commandLine.filename = args[args.length - 1];
		commandLine.onlyCountReady = Arrays.asList(args).contains("-r");
		return countOrders(commandLine);
	}

	private long countOrders(CommandLine commandLine) throws IOException {
		File input = new ClassPathResource(commandLine.filename).getFile();
		ObjectMapper mapper = new ObjectMapper();
		Order[] orders = mapper.readValue(input, Order[].class);
		if (commandLine.onlyCountReady){
			return Stream.of(orders)
				.filter(o -> "ready".equals(o.getStatus()))
				.count();
		}else{
			return orders.length;
		}
	}

	static class CommandLine {
		private String filename;
		private boolean onlyCountReady;
	}
}
