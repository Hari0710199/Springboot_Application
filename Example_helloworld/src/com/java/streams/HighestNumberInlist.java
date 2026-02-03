package com.java.streams;

import java.lang.foreign.Linker.Option;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestNumberInlist {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(31, 41, 51, 61);

		System.out.println(list.stream().max(Integer::compareTo).get());
		System.out.println("sum of the list : " + list.stream().reduce(0, Integer::sum));

		Optional<Integer> opthigh = list.stream().sorted(Comparator.reverseOrder()).findFirst();
		System.out.println("highest : " + opthigh);
		Optional<Integer> optlow = list.stream().sorted(Comparator.reverseOrder()).findFirst();

		System.out.println("lowest : " + optlow);

	}
}
