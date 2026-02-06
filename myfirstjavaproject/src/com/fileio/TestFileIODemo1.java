package com.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFileIODemo1 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main method started ");

		PrintWriter pw = new PrintWriter("C:\\Users\\srknt\\Srikanth Java\\test\\Hello1.txt");

		pw.println("Hello Guys, Good morning !!");
		pw.println(false);
		pw.println('A');
		pw.println(100);
		pw.println(45.5F);
		pw.println();
		pw.println(854236789L);
		pw.flush();
		
		pw.close();
		System.out.println("main method started ");
		
	}
}
