package com.java.collectionsMap;

import java.util.*;
import java.util.Map.Entry;

//doesn't maintain inseration order
public class HashMapExample {

	public static void main(String args[]) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		hashMap.put("a", 100);
		hashMap.put("b", 200);
		hashMap.put("c", 300);
		hashMap.put("d", 400);

		System.out.println("Hashmap  " + hashMap);
		for(Entry<String, Integer> me : hashMap.entrySet()) {
			System.out.print("Key " + me.getKey() + ":");
			System.out.println("Value " + me.getValue());
		}
	}
}
