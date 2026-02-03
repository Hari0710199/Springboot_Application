package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainEmployeeUsingStreams {
	public static void main(String[] args) {

		List<EmployeeUsingStreams> employee = Arrays.asList(new EmployeeUsingStreams(1, "jaba", 909090),
				new EmployeeUsingStreams(2, "Krishna", 70000), new EmployeeUsingStreams(3, "Ravi", 40000));

		EmployeeUsingStreams highestSalaryEmployee = employee.stream()
				.max(Comparator.comparing(EmployeeUsingStreams::getSalary)).get();

		System.out.println("Highest salary " + highestSalaryEmployee.getName());

		EmployeeUsingStreams lowestSalaryEmployee = employee.stream()
				.min(Comparator.comparing(EmployeeUsingStreams::getSalary)).get();

		System.out.println("Lowest salary " + lowestSalaryEmployee.getName());

		employee.stream().filter(e -> e.getSalary() > 50000).map(EmployeeUsingStreams::getName)
				.forEach(System.out::println); // salary greater than 50

	}
}
