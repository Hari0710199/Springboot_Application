package com.java.collections.list;

import java.util.LinkedList;

//list allow duplicate elements
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hari");
		list.add("Krishna");
		list.add("Hari");
		System.out.println("Print " + list);

		// Adding at index
		list.add(2, "Rajolla");
		System.out.println("after adding at index " + list);

		list.remove("For");
		System.out.println("After removing " + list);

		Object[] a = list.toArray();
		for (Object element : a) {
			System.out.print("After converted LinkedList to Array: " + element);
		}
		System.out.println("removed first " + list.removeFirst());

		System.out.println("removed last " + list.removeLast());

		list.addFirst("R");

		// Add an element to the end of the linked list
		list.addLast("a");

		// Print the elements of the linked list
		for (String s : list) {
			System.out.println("After adding first and last " + s);
		}
	}
}
