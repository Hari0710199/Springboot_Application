package com.java.Singleton;

public class SingletonExample {

	private SingletonExample() {
		System.out.println("Singleton");
	}

	private static SingletonExample singletonExample;

	public static SingletonExample getInstance() {
		if (singletonExample == null) {
			singletonExample =  new SingletonExample();
		}
		return singletonExample;
	}

}
