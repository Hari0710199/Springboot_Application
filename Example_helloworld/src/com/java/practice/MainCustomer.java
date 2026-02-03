package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class MainCustomer {
	public static void main(String[] args) {
		List<Customer> list = new ArrayList<Customer>();

		Customer customer1 = new Customer(1, "Amazon", 56666, "rajollakrishna@gmail.com");
		Customer customer2 = new Customer(2, "Flipkart", 79898, "rajollakrishna@gmail.com");
		Customer customer3 = new Customer(1, "Amazon", 34345, "rajollakrishna@gmail.com");
		Customer customer4 = new Customer(4, "Zomato", 98765, "rajollakrishna@gmail.com");
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		System.out.println("Customer : " + list);

		List<Customer> customers = Arrays.asList(customer1, customer2, customer3, customer4);

		customers.stream().filter(c -> c.getName().startsWith("A")).forEach(System.out::println);

		Customer highestSalaryCustomer = customers.stream().max(Comparator.comparingInt(Customer::getSalary))
				.orElse(null);
		Customer LowestSalaryCustomer = customers.stream().min(Comparator.comparingInt(Customer::getSalary))
				.orElse(null);

		System.out.println("Highest Salary : " + highestSalaryCustomer);
		System.out.println("Lowest Salary : " + LowestSalaryCustomer);
		
	}
}
