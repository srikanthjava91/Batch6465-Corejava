package com.java8features;

@FunctionalInterface
interface TestIn3 {
	int multiplication(int a, int b);
}

public class TestJ8Demo3 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		TestIn3 t1 = (x, y) -> {
			return x * y;
		};

		System.out.println(t1.multiplication(10, 30));// 300

	}

}
