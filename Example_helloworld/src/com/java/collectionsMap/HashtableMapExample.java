package com.java.collectionsMap;

import java.util.Hashtable;

// it will print in descending order
public class HashtableMapExample {

	public static void main(String args[]) {

		Hashtable<Integer, String> hashTable1 = new Hashtable<>();

		Hashtable<Integer, String> hashTable2 = new Hashtable<Integer, String>();

		hashTable1.put(1, "one");
		hashTable1.put(2, "two");
		hashTable1.put(3, "three");

		hashTable2.put(4, "four");
		hashTable2.put(5, "five");
		hashTable2.put(6, "six");

		System.out.println("Mappings of hashTable1 : " + hashTable1);
		System.out.println("Mappings of hashTable2 : " + hashTable2);
	}

}
