package com.exceptionhandling;

public class TestExDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			System.out.println("in try");
			int c = 100 / 2;
			System.out.println("srikanth".charAt(c));
		} catch (NullPointerException e) {
			System.err.println("in catch of NE");
		} catch (ArithmeticException e) {
			System.err.println("in catch of AE");
		}

		catch (RuntimeException e) {
			System.err.println("in catch of E");
		} catch (Exception e) {
			System.err.println("in catch of E");
		} catch (Throwable e) {
			System.err.println("in catch of E");
		}

		System.out.println("main method ended ");
	}

}
