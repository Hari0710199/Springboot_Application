package com.java.java8Features;

import java.util.*;
import java.util.stream.Stream;

//Stream API is used to process collections of objects. A stream in Java is a 
//sequence of objects that supports various methods that can be pipelined to produce the desired result. 
public class DemoStreamAPI {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9, 4, 1, 7, 3);

		// Creating a stream
		Stream<Integer> data = list.stream();

		// we can use stream only once and we
//		data.forEach(num -> System.out.println(num));

		// to print in sorted by changing the object name
//		Stream<Integer> sorted = data.sorted();
//		sorted.forEach(System.out::println);

		// to double the array
		System.out.println("Double the array");
		list.stream().filter(n -> n % 2 == 1).sorted().map(n -> n * 2).forEach(System.out::println);

		Integer var = list.stream().max(Integer::compare).get();

		System.out.print("Highest Value " + var);

		// find first number in array
		Optional<Integer> first = list.stream().findFirst();
		System.out.println("First " + first);

	}
}
