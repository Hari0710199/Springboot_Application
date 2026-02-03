package com.java.Singleton;

public class ThreadSafeSIingletonUsingSynchronized {
	private static ThreadSafeSIingletonUsingSynchronized name;

	private ThreadSafeSIingletonUsingSynchronized() {
		System.out.println("Synchronized Thread Safe Singleton");
	}

	public synchronized static ThreadSafeSIingletonUsingSynchronized getInstance() {
		if (name == null) {
			name = new ThreadSafeSIingletonUsingSynchronized();
		}
		return name;

	}
}
