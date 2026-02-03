package com.java.java8Features;

import java.util.*;

// It represents the instances of functional interfaces (interfaces with a single abstract method).
// syntax  (argument list) -> { body of the expression }
public class LambdaExpressionExample {
	public static void main(String args[]) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println("Elements of the ArrayList: ");
		list.forEach(n -> System.out.println(n));

		System.out.println("Even elements of the ArrayList: ");
		list.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});
		System.out.println("Odd elements of the ArrayList: ");
		list.forEach(n -> {
			if (n % 2 != 0)
				System.out.println(n);
		});
	}
}
