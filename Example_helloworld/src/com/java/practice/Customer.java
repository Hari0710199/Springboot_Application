package com.java.practice;

import java.util.Objects;

public class Customer {

	public int id;
	public String name;
	public int Salary;
	public String email;

	public Customer() {

	}

	public Customer(int id, String name, int salary, String email) {
		this.id = id;
		this.name = name;
		this.Salary = salary;
		this.email = email;
	}

	public int getId(int id) {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return Salary;
	}

	public String getEmail() {
		return email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", Salary=" + Salary + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Salary, email, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Salary == other.Salary && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name);
	}

}
