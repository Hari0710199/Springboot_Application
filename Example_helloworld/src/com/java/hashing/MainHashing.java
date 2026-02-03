package com.java.hashing;

import java.util.HashSet;
import java.util.Set;

public class MainHashing {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); // hashing and equals method
		set.add("Java");
		set.add("prpgramming");
		set.add("class");
		set.add("object");
		set.add("prpgramming");
		// System is an Pre defined class and out is an instance varible and println is
		// an method
		System.out.println("Set :" + set);

		Set<Employee> employee = new HashSet<Employee>();
		Employee emp1 = new Employee(1, "Sai");
		Employee emp2 = new Employee(2, "Hari");
		Employee emp3 = new Employee(3, "Ganesh");
		Employee emp4 = new Employee(4, "Lokesh");
		Employee emp5 = new Employee(1, "Ganesh");

		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		employee.add(emp5);

		System.out.println(" Employee set : " + employee);
		System.out.println(" Employee size : " + employee.size());
	}
}
