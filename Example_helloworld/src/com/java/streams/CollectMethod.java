package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Salman");
		list.add("Salmankhan");
		list.add("sharkuh Khan");
		list.add("soundraya");
		list.add("rajamouli");
		list.add("prabhas");
		System.out.println("List :" + list);
		// without streams to check the length of that string by filter
		List<String> list1 = list.stream().filter(s -> s.length() >= 9).collect(Collectors.toList());
		System.out.println("After using collect method in streams by filter  :" + list1);

		// without streams to check the length of that string by map
		List<String> list2 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("After using collect method in streams by map  :" + list2);

		// without streams to check the length of that string by count
		long list3 = list.stream().filter(s -> s.length() >= 9).count();
		System.out.println("Number of Strings greater then length 9  :" + list3);
	}
}
