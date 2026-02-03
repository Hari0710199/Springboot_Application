package com.java.collectionsMap;

import java.util.*;

//TreeMap will print in Ascending (or) sorted order
public class TreeMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new TreeMap<>();

		map.put("Sweta", 10);
		map.put("Amiya", 30);
		map.put("Gudly", 20);

		for (Map.Entry<String, Integer> e : map.entrySet())

			System.out.println(e.getKey() + " " + e.getValue());

		map.remove("Gudly");
		System.out.println("after remove " + map);
	}

}
