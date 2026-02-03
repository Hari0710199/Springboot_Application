package com.java.collections.list;

import java.util.*;

//list allow duplicate elements and maintain sorting order 
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(15);
		list.add(12);
		System.out.println("Print " + list);
		Set<Integer> set = new HashSet<Integer>(list);
		System.out.println("Set will remove duplicate elements : " + set);
		// Adding at index
		list.add(2);
		System.out.println("after adding at index " + list);
		Collections.sort(list);// for sorting assending order
		System.out.println("After Sorting :" + list);

		Collections.sort(list, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);// using itenary operator

		System.out.println("After sorting using comparator and lambda expression  in desending order " + list);
	}
}
