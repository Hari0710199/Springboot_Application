package com.java.Singleton;

// The purpose of the singleton pattern it only allows us to creates us particular instance(Single Object) of that class.
public class Singleton {

	private Singleton() { // Constructor
		System.out.println("Names");
	}

	private static Singleton name;// Variable declaration

	public static Singleton getInstance() {
		if (name == null) {
			name = new Singleton();
		}
		return name;
	}

}

