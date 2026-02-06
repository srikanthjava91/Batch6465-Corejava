package com.java8features;

@FunctionalInterface
interface TestIn4 {
	String show(String s);
}

public class TestJ8Demo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		TestIn4 t = a -> a.toUpperCase();

		TestIn4 t = (a) -> {
			String name = a.toUpperCase();
			return name;
		};

		System.out.println(t.show("java is simple & jav8 is more simle "));
	}
}
