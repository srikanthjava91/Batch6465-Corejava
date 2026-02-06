package com.operators;

//2) Assignment Operators 
//= += -= *= %= /= 
public class TestOpDemo2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;

		System.out.println(a);
		System.out.println(b);

		int result = 0;
		result = result + 2;
		System.out.println(result);// 2

//		result = (int) (result + 5.5);
		result += 5.5;// result = result + 5.5;
		System.out.println(result);// 7 or 7.5 or 8 or CE

		result -= 3.5;// result = result -3.5
		System.out.println(result);// 3

		result *= 4.5;//result = result * 4.5
		System.out.println(result);// 13

		result %= 3;//result = result%3 
		System.out.println(result);// 1

		result /= 1;//result = result/1
		System.out.println(result);// 1

	}

}
