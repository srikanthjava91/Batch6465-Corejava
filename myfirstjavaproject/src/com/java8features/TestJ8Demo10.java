package com.java8features;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestJ8Demo10 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Supplier<Date> s2 = () -> new Date();
		System.out.println(s2.get());

		Supplier<String> s1 = () -> {
			return "Java 8 is more simple tahn Java";
		};
		System.out.println(s1.get());

		Consumer<Integer> c1 = (i) -> System.out.println(i * i * i);
		c1.accept(10);

		Consumer<String> c2 = (i) -> System.out.println(i.toUpperCase());
		c2.accept("Good Morning ");

		Function<String, Integer> f2 = (s) -> s.length();
		System.out.println(f2.apply("Javaissimple"));

		Function<String, String> f3 = (s) -> s.toUpperCase();
		System.out.println(f3.apply("Javaissimple"));

		Function<Integer, Integer> f1 = (i) -> i * i;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(100));
		System.out.println(f1.apply(9));

		Predicate<String> p2 = s -> s.contains("h");
		System.out.println(p2.test("Srikanth"));
		System.out.println(p2.test("Rohith"));
		System.out.println(p2.test("Kohli"));
		System.out.println(p2.test("Sachin"));
		System.out.println(p2.test("Dhoni"));

		System.out.println("***************");
		Predicate<Integer> p1 = (i) -> i % 2 == 0;
		System.out.println(p1.test(100));// true
		System.out.println(p1.test(9));// false
		System.out.println(p1.test(18));// true
		System.out.println(p1.test(45));// false

	}
}
