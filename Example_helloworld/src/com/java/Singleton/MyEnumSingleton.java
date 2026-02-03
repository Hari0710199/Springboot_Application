package com.java.Singleton;

public enum MyEnumSingleton {

	INSTANCE;

	public void doSomething() {
		System.out.println("Singleton using Enum");
	}
}
