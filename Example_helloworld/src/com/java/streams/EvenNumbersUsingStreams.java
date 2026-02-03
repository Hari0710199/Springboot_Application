package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersUsingStreams {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 11, 22, 33, 1);
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
}
