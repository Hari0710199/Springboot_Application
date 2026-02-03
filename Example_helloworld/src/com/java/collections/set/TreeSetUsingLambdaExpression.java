package com.java.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetUsingLambdaExpression {
	public static void main(String[] args) {

		Set<Integer> treeset = new TreeSet<Integer>(((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0));

		treeset.add(12);
		treeset.add(1);
		treeset.add(99);
		treeset.add(78);
		treeset.add(45);
		treeset.add(23);

		treeset.add(23);

		System.out.println(" Displaying the TreeSet using lambda expression and  " + treeset);

	}

}
