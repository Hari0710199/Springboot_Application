package com.java.exception;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

	public static void readFile() throws IOException {
		FileReader fileReader = new FileReader("data.txt");
		System.out.println("File opened successfully!");
	}

	public static void main(String[] args) {
		try {
			readFile();
		} catch (IOException e) {
			System.out.println("File not found or error reading the file.");
		}
	}
}
