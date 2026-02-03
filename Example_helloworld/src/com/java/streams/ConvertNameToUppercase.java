package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class ConvertNameToUppercase {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "lava", "kaka");
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		list.stream().map(String::toLowerCase).forEach(System.out::println);
	}
}
