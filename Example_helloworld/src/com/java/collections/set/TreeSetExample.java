package com.java.collections.set;

import java.util.*;

//Maintain inseration(or)sorted order and set doesn't allow duplicate elements and treeset will help for ascending order
public class TreeSetExample {
	public static void main(String[] args) {

		Set<String> treeset = new TreeSet<String>();

		treeset.add("India");
		treeset.add("Australia");
		treeset.add("South Africa");

		treeset.add("India");

		System.out.println(" Displaying the TreeSet " + treeset);
		
	}
}
