package com.java.collections.set;

import java.util.*;

//doesn't maintain inseration order and set doesn't allow duplicate elements
public class HashSetExample {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();

		s.add("Hari");
		s.add("Krishna");
		s.add("Rajolla");
		s.add("Hari");
		s.add("Rajolla");

		System.out.println(s);

	}
}
