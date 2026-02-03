package com.java.exception;

public class NestedTryCatch {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;

		try {
			try {
				int z = x / y;
				System.out.println("Z " + z);
			} catch (ArithmeticException e) {
				System.out.println("Inner catch: divide by zero");
			}
		} catch (Exception e) {
			System.out.println("Outer catch");
		}

	}

}
