package com.java.threads;

public class RunnableMain {
	public static void main(String[] args) {
		Thread thread = new Thread(new RunnableInterface());
		thread.start();
	}
}
