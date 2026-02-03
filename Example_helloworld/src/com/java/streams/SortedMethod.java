package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedMethod {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(34);
		list.add(234);
		list.add(32);
		list.add(134);
		list.add(3);
		System.out.println("Without streams :" + list);
		// Default Natural Sorting order
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Default Natural Sorting order :" + list1);

		// Customized Sorting order or descending order
//		List<Integer> list2 = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		List<Integer> list2 = list.stream().sorted((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0)
				.collect(Collectors.toList());

		System.out.println("Customized Sorting order or descending order :" + list2);
	}
}
