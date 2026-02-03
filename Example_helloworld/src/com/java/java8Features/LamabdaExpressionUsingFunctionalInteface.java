package com.java.java8Features;

public class LamabdaExpressionUsingFunctionalInteface {
	public static void main(String[] args) {
		FunctionalInteferfaceExample functionalInteferfaceExample = () -> System.out
				.println("Functional Interface using lambda expression");
		functionalInteferfaceExample.m1();
	}
}
