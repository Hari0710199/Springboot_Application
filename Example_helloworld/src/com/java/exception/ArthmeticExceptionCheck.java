package com.java.exception;

public class ArthmeticExceptionCheck {

	public static void main(String[] args) {
		int n = 10;
		int m = 0;

		try {

			int ans = n / m;
			System.out.println("Answer: " + ans);
		} catch (ArithmeticException e) {
			throw e;
//			System.out.println("Error: Division by zero is not allowed!");
		} finally {
			System.out.println("Program continues after handling the exception.");

		}
	}

}
