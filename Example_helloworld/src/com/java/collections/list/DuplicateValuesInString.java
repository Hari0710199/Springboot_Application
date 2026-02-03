package com.java.collections.list;

import java.util.*;
import java.util.stream.*;

public class DuplicateValuesInString {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("apple", "banana", "cat", "apple", "dog", "banana", "egg");

		Set<String> seen = new HashSet<>();

		Set<String> duplicates = names.stream().filter(name -> !seen.add(name)) // add() returns false → duplicate
				.collect(Collectors.toSet());

		System.out.println("Duplicate values: " + duplicates);
		System.out.println("Duplicate values cbu: " + names.stream().sorted().distinct().toList());

	}
}
