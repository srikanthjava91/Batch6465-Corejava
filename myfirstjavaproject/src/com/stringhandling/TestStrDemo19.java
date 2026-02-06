package com.stringhandling;

public strictfp class TestStrDemo19 {

	public static void main(String[] args) {

		String str = "Srikanth Java insta Srikanth Java insta";
		System.out.println(str.indexOf('a'));// 4
		System.out.println(str.indexOf('a', str.indexOf('a') + 1));
		System.out.println(str.indexOf('a', str.indexOf('a', str.indexOf('a') + 1) + 1));
		System.out.println(str.indexOf('a', str.indexOf('a', str.indexOf('a', str.indexOf('a') + 1) + 1) + 1));

		System.out.println(str.indexOf("ant"));
		System.out.println(str.indexOf("ant",str.indexOf("ant")+1));
	}

}
