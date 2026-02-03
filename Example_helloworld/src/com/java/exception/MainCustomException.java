package com.java.exception;

public class MainCustomException {

	public static void checkAge(int age) throws CustomException {
		if (age < 18) {
			throw new CustomException("Age must be 18 or above!");
		}
		System.out.println("Valid age!");
	}

	public static void main(String[] args) {
		try {
			checkAge(15); // This will throw exception
		} catch (CustomException e) {
			System.out.println("Error: " + e.getMessage());

		}
	}

}
