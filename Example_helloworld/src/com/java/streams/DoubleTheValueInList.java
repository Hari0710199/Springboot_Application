package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleTheValueInList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(89);
		list.add(88);
		list.add(12);
		list.add(22);
		list.add(34);
		list.add(77);
		list.add(67);
		list.add(78);
		list.add(90);
		list.add(98);
		System.out.println(list);
		// Without streams
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int i : list) {
			list1.add(i * 2);
		}
		System.out.println("List without streams :" + list1);

		// With Using Streams
		List<Integer> list2 = list.stream().map(I -> I * 2).collect(Collectors.toList());
		System.out.println("Using Streams: " + list2);

	}

}
