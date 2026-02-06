package com.languagefundamentals;

public class TestDemo9 {
	static String name = "Srikanth";

	static public strictfp final synchronized void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(TestDemo9.name.length());// 8
	}
}
