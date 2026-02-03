package com.java.exception;

import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("data.txt")) {
			System.out.println("File reading...");
		} catch (IOException e) {
			System.out.println("File not found!");
		}

	}
}
