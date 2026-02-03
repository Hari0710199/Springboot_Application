package com.java.Singleton;

public class StaticInnerClassSingletonMain {
	public static void main(String[] args) {
		StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
		staticInnerClassSingleton.doSomething();
	}
}
