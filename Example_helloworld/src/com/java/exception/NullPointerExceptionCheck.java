package com.java.exception;

public class NullPointerExceptionCheck {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Sting is null");
		} finally {
			System.out.println("finally will This will always execute.");
		}

	}
}
