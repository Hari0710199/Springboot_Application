package com.java.Singleton;

public class DoubleCheckingSingleton {

	private static DoubleCheckingSingleton username;

	private DoubleCheckingSingleton() {
		System.out.println("DoubleCheckingSingleton");
	}

	public static DoubleCheckingSingleton getInstance() {
		if (username == null) {
			synchronized (Singleton.class) {
				if (username == null) {
					username = new DoubleCheckingSingleton();
				}
			}
		}

		return username;

	}
}
