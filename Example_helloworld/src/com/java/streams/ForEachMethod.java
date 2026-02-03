package com.java.streams;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Salman");
		list.add("Salmankhan");
		list.add("sharkuh Khan");
		System.out.println("List :" + list);
		// Lambda expression
		list.stream().forEach(s -> System.out.println(s));

		// Method reference
		list.stream().forEach(System.out::println);
	}
}
