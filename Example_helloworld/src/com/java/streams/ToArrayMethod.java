package com.java.streams;

import java.util.ArrayList;
import java.util.List;

public class ToArrayMethod {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(34);
		list.add(234);
		list.add(32);
		list.add(134);
		list.add(3);
		System.out.println("Without streams :" + list);
		// To array method
		Integer array[] = list.stream().toArray(Integer[]::new);
		for (Integer i : array) {
			System.out.println(i);
		}
	}
}