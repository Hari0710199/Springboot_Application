package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mainclass {

	public static void main(String[] args) {

		List<EmployessAgeGreaterThan20> employees = Arrays.asList(
				new EmployessAgeGreaterThan20("Kanna", 22),
				new EmployessAgeGreaterThan20("Reddy", 18),
				new EmployessAgeGreaterThan20("John", 25),
				new EmployessAgeGreaterThan20("Mary", 19));

		List<EmployessAgeGreaterThan20> result = 
				employees.
				stream().
				filter(e -> e.age > 20)
				.collect(Collectors.toList());

		System.out.println("Employees with age > 20:");
		result.forEach(System.out::println);
	}
}
