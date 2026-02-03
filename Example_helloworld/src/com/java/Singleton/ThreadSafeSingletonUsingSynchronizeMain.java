package com.java.Singleton;

public class ThreadSafeSingletonUsingSynchronizeMain {

	public static void main(String[] args) {
		ThreadSafeSIingletonUsingSynchronized.getInstance();
		ThreadSafeSIingletonUsingSynchronized.getInstance();
		ThreadSafeSIingletonUsingSynchronized.getInstance();
		ThreadSafeSIingletonUsingSynchronized.getInstance();

	}

}
