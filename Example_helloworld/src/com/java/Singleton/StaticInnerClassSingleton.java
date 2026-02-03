package com.java.Singleton;

public class StaticInnerClassSingleton {

	private StaticInnerClassSingleton() {
	}

	private static class SingletonHelper {
		private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
	}

	public static StaticInnerClassSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	public void doSomething() {
		System.out.println("Singleton using Static Inner Class");
	}
}
