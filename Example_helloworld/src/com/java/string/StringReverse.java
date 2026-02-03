package com.java.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverse {
	public static void main(String[] args) {

		String name = "StRing";
		String reversed = new StringBuffer(name).reverse().toString();
		System.out.println("Using Stringbuilder " + reversed);

		String reversedUsingStreams = IntStream.range(0, name.length())
				.mapToObj(i -> name.charAt(name.length() - 1 - i)).map(String::valueOf).collect(Collectors.joining());

		System.out.println("Using Streams " + reversedUsingStreams);

	}
}