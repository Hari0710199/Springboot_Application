package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(90, 99, 43, 21);
		int secondHighestNumber = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new RuntimeException("Runtineexception"));
		System.out.println("SecondHighestNumber : " + secondHighestNumber);

		long count = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println("Long : " + count);
	}

}