package com.java.string;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Java";
		String r = " ";
		char ch ;

		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			r = ch + r;
		}
		System.out.println("char " + r);

	}
}
