package com.java.streams;

import java.util.stream.Stream;

public class StreamOf {
	public static void main(String[] args) {
		// For group of values
		Stream<Integer> s = Stream.of(9, 99, 999, 999);
		s.forEach(System.out::println);

		// For arrays
		Stream<Double> d = Stream.of(10.2, 10.2, 10.3, 10.4);
		d.forEach(System.out::println);
	}
}
