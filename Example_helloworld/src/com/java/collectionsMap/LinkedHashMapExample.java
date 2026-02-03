package com.java.collectionsMap;

import java.util.*;
import java.util.Map.Entry;

//Maintain insertion order
public class LinkedHashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Rohit");
		map.put(90, "Irfan");
		map.put(99, "Kohli");

		System.out.println("Printing LinkedHashmap " + map);
		for (Entry<Integer, String> set : map.entrySet()) {
			System.out.println("Key and value  " + set.getKey() + ":" + set.getValue());

			int key = set.getKey();

			String value = set.getValue();

			System.out.println(key + " : " + value);
		}
	}

}
