package com.java.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 45, 3, 99, 23);

		int max = Collections.max(list);

		System.out.println("Using max " + max);

		int[] arr = { 10, 45, 3, 99, 23 };

		int max1 = Arrays.stream(arr).max().orElseThrow();

		System.out.println("Using Array " + max1);

		int usingStreams = list.stream().mapToInt(Integer::intValue).max().orElseThrow();

		System.out.println("usingStreams " + usingStreams);

	}
}
