package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestExDemo13 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		try {
			FileReader fr = new FileReader("C:\\Users\\srknt\\Srikanth Java\\test\\Hello1.txt");

			try {
				int n = fr.read();

				while (n != -1) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.print((char) n);
					n = fr.read();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("main method ended ");
	}
}
