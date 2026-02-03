package com.java;

import java.util.*;

public class ArrayLength {

	public static void main(String[] args) {
		int arr[] = { 23, 34, 78, 99 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println("Sum of array " + sum);
		// using streams
		Arrays.stream(arr).sum();
		System.out.println("sum " + sum);
		System.out.println(arr.length);

		List<Integer> list = Arrays.asList(10, 20, 30, 40);

		int listSum = list.stream().mapToInt(Integer::intValue).sum();

		System.out.println("listSum " + listSum);

	}
}
