package com.java.exception;

public class ThrowKeyException {
	public void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not eligible to vote");
		}
		System.out.println("Eligible to vote");
	}

	public static void main(String[] args) {
		ThrowKeyException throwKeyException = new ThrowKeyException();
		throwKeyException.checkAge(34);
	}

}
