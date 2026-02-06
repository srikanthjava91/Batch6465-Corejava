package com.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//LambdaExpression vs Collections related Comparator  
public class TestJ8Demo7 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10, 9, 1, 2, 3, 45, 18, 10);
		Comparator<Integer> c = (i1, i2) -> (i1 > i2) ? 1 : (i1 < i2) ? -1 : 0;
		Collections.sort(l, c);
		System.out.println(l);
	}
}
