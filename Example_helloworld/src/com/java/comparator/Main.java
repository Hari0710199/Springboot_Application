package com.java.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "sai", 89999));
		list.add(new Employee(2, "Abhi", 23000));
		list.add(new Employee(3, "koko", 150000));
		list.sort(Comparator.comparing(Employee::getSalary).reversed());

		list.forEach(System.out::println);

	}
}
