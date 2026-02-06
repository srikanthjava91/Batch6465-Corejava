package com.java8features;

import java.util.function.Function;

public class TestJ8Demo13 {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = (i) -> i * i * i;
		Function<Integer, Integer> f2 = (i) -> i * 2;
//		System.out.println(f1.apply(2));
//		System.out.println(f2.apply(3));
		System.out.println(f1.andThen(f2).apply(2));// 16
		System.out.println(f1.compose(f2).apply(2));// 64
	}
}
