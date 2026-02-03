package com.java.exception;

public class MultipleCatchBlocksArrayOutBoundException {
	public static void main(String[] args) {
		int arr[] = { 1, 23, 34, 22, 55, 66 };

		try {
			System.out.println("Array of bound :" + arr[6]);
		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("Array index error!");
		} catch (Exception exception) {
			System.out.println("General exception occurred!");
		} finally {
			System.out.println("finally will always excutes");
		}

	}

}