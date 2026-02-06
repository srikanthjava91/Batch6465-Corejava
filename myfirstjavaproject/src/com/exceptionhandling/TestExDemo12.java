package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestExDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\Hello.txt");
		try {
			f.createNewFile();//Unhandled exception type IOException
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main method ended ");
	}
}
