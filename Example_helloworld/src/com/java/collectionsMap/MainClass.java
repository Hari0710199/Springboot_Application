package com.java.collectionsMap;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
public static void main(String[] args) {
	Set<Employee> employeeSet = new HashSet<>();

	Employee emp1 = new Employee(1, "Hari");
	Employee emp2 = new Employee(2, "Krishna");
	Employee emp3 = new Employee(1, "Hari");

	employeeSet.add(emp1);
	employeeSet.add(emp2);
	employeeSet.add(emp3);

	for (Employee emp : employeeSet) {
		System.out.println(emp);
	}
}
}
