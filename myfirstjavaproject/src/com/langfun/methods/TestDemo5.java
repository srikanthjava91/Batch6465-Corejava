package com.langfun.methods;

import java.util.Scanner;

public class TestDemo5 {

	static double getEmpSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp salary : ");
		double sal = sc.nextDouble();
		return sal;

	}

	static double getEmpBonus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp bonus : ");
		double bonus = sc.nextDouble();
		return bonus;

	}

	public static void main(String[] args) {
		double salary = getEmpSalary();
		double bonus = getEmpBonus();

		System.out.println("Employee Total salary : " + (salary + bonus));
	}

}
