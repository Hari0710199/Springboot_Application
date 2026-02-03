package com.java.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	public static void main(String args[]) {
		List<String> list = Arrays.asList("Loki", "Venki", "Abbas", "bereket");
		List<String> upperCaseNames = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Uppercases : " + upperCaseNames);

		List<String> lowerCaseNames = list.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println("Lowercasename : " + lowerCaseNames);

		list.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
		list.stream().map(String::toLowerCase).sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}
}
