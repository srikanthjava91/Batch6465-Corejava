package com.java8features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class TestJ8Demo14 {

	public static void main(String[] args) {
		System.out.println("main method stareted");

		IntPredicate ip = (i1) -> i1 % 2 == 0;
		System.out.println(ip.test(10));

		BiPredicate<Integer, Integer> bp1 = (i1, i2) -> i1 * i2 % 2 == 0;
		System.out.println(bp1.test(9, 9));
		System.out.println(bp1.test(10, 10));

		BiFunction<String, String, Integer> bif1 = (s1, s2) -> s1.length() + s2.length();
		System.out.println(bif1.apply("Java", "Srikanth"));

		BiConsumer<String, String> bc = (s1, s2) -> {
			System.out.println(s1.toUpperCase());
			System.out.println(s1.toLowerCase());
		};

		bc.accept("Java is simple", "in VCUBe");

	}

}
