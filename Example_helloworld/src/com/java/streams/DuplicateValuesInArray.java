package com.java.streams;

import java.util.*;
import java.util.stream.*;

public class DuplicateValuesInArray {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 50, 10);

		Set<Integer> duplicates = numbers.stream().filter(n -> Collections.frequency(numbers, n) > 1)
				.collect(Collectors.toSet()); // set to avoid repeating duplicates

		System.out.println("Duplicate values: " + duplicates);
	}
}
