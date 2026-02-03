package com.java.streams;

import java.util.ArrayList;
import java.util.List;

public class MinAndMaxExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(34);
		list.add(234);
		list.add(32);
		list.add(134);
		list.add(3);
		System.out.println("Without streams :" + list);
		// For Min value
//		Integer list1 = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		Integer list1 = list.stream().mapToInt(Integer::intValue).min().orElseGet(null);

		System.out.println("For Min value :" + list1);

		// For Max value
		Integer list2 = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		// Integer list2 = list.stream().mapToInt(Integer ::
		// intValue).max().orElseGet(null);

		System.out.println("For Max value :" + list2);
	}
}
