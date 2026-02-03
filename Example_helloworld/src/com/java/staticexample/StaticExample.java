package com.java.staticexample;

public class StaticExample {

	public static String name = "Ganesh";

	public String email;

	public static void staticMethod() {
		System.out.println("Inside Static method");
	}

	public void normalMethod() {
		System.out.println("Inside normal method");
	}

	static {// static block
		System.out.println("Hello Static");
	}

	public static void main(String[] args) {
		StaticExample staticExample = new StaticExample();
		System.out.println("calling with object" + staticExample.name);
		System.out.println("calling with Static" + StaticExample.name);
		staticExample.staticMethod();
		StaticExample.staticMethod();
		System.out.println("Hello main");
	}

}
