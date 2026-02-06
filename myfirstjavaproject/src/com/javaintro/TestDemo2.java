package com.javaintro;

public class TestDemo2 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started !");
		Class.forName("com.javaintro.TestDemo1");
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
}
