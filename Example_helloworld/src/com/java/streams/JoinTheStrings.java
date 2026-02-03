package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinTheStrings {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("erre", "tyty", "rere");
		String join = String.join(",", list);
		System.out.println("Join using Strings " + join);
		String stream = list.stream().collect(Collectors.joining(","));
		System.out.println("Join using Streams " + stream);

	}
}
