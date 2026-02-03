package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class NumberOfEmployeeStartsWithA {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "Anish", "Amar", "abhi");
		Long count = names.stream().filter(name -> name.toLowerCase().startsWith("a")).count();

		System.out.println("Number of elements starting with A: " + count);
	}
}