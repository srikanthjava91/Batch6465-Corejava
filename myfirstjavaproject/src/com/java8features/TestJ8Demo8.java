package com.java8features;

@FunctionalInterface
interface TestIn8 {
	void hello();

}

interface TestIn7 {
	void show();

	void display();
}

public class TestJ8Demo8 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		TestIn8 t8 = () -> System.out.println("Hello Guys, Wassup !!");
		t8.hello();

		TestIn7 t = new TestIn7() {
			@Override
			public void show() {
				System.out.println("Inner classes are comedy !!");
			}

			@Override
			public void display() {
				System.out.println("display method called ");
			}

		};

		t.show();

	}

}
