package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("springboot", "Microservices", "git");
		String longestString = list.stream().max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println("LongestString : " + longestString);
	}
}
