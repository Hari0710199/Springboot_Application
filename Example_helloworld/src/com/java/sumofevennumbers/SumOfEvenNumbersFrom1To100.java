package com.java.sumofevennumbers;

import java.util.stream.IntStream;

public class SumOfEvenNumbersFrom1To100 {

	public static void main(String[] args) {
		int sum = 0;
		int even = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println(i + " ");
				System.out.println("Sum of all even numbers from 1 to 100 is: " + sum);
			} else {
				even = even + i;
				System.out.println(i + " ");
				System.out.println("Sum of all odd numbers from 1 to 100 is: " + even);
			}
		}

		int sumUsingStreams = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).sum();

		System.out.println("Sum of even numbers from 1 to 100: sumUsingStreams" + sumUsingStreams);

	}

}
