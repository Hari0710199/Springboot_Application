package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "sai", 150000));
		list.add(new Employee(2, "Abhi", 23000));
		list.add(new Employee(3, "koko", 90000));

		Collections.sort(list);
		list.forEach(e -> System.out.println(e.getSalary()));
	}
}
