package com.nemo.refactoring.ch06.class11.step03;

import java.io.File;
import java.io.IOException;
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
			throw new IllegalArgumentException("input the file name.");
		}
		CommandLine commandLine = new CommandLine(args);
		return countOrders(commandLine, args, commandLine.filename(args));
	}

	private long countOrders(CommandLine commandLine, String[] args, String filename) throws IOException {
		File input = new ClassPathResource(filename).getFile();
		ObjectMapper mapper = new ObjectMapper();
		Order[] orders = mapper.readValue(input, Order[].class);
		if (Arrays.asList(args).contains("-r")){
			return Stream.of(orders)
				.filter(o -> "ready".equals(o.getStatus()))
				.count();
		}else{
			return orders.length;
		}
	}

	static class CommandLine {
		String[] args;

		public CommandLine(String[] args) {
			this.args = args;
		}

		private String filename(String[] args) {
			return args[args.length - 1];
		}
	}
}
