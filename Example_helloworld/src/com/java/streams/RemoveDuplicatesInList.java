package com.java.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesInList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(91, 52, 33, 4, 51, 77, 62, 20, 43, 33, 91);
		List<Integer> remove = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println("After removing dupliacte elements using streams  = " + remove);

		Set<Integer> uniqueSet = new HashSet<>(list);

		System.out.println("After removing dupliacte elements using set  = " + uniqueSet);
	}
}
