package com.javaintro;

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Hello main method !");
		System.out.println(Class.forName("com.javaintro.Hello"));
		System.out.println(Class.forName("java.lang.String"));

		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
	}

}
