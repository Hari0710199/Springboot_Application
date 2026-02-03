package com.java.optional;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String name = "Name";
		Optional<String> optionalName = Optional.ofNullable(name);
		optionalName.ifPresent(System.out::println);
	}
}
