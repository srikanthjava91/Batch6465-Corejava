package com.javaintro;

public class Cricketer {

	// Declaration
	// instance or non static variable
	int jerseyno;
	String name;

	// static variables
	static int countryId = 91;
	static String countyName = "India";

	public static void main(String[] args) {
		System.out.println("main method started !");
		System.out.println("Welcome to Indian Cricket Team !");

		System.out.println("************Object1 info !");
		// Creating an object of a class
		Cricketer dh = new Cricketer();
		dh.jerseyno = 7;
		dh.name = "Dhoni";
		// Accessing static data directly is possible.
		System.out.println("Country ID : " + Cricketer.countryId);
		System.out.println("Country Name : " + Cricketer.countyName);

		// Accessing instance data
		// instance data we cannot access directly
		// if we want to access instance data, we must need to create an object
		System.out.println("Jersey No  :" + dh.jerseyno);
		System.out.println("Cricketer name : " + dh.name);

		System.out.println("************Object2 info !");
		Cricketer v = new Cricketer();
		v.jerseyno = 18;
		v.name = "Virat";
		System.out.println("Country ID : " + countryId);// 91
		System.out.println("Country Name : " + countyName);// India
		System.out.println("Jersey No  :" + v.jerseyno);// 18
		System.out.println("Cricketer name : " + v.name);// Virat

		System.out.println("************Object3 info !");
		Cricketer r = new Cricketer();
		countryId = 92;
		countyName = "Bharath";
		r.jerseyno = 45;
		r.name = "Rohit";
		System.out.println("Country ID : " + countryId);// 92
		System.out.println("Country Name : " + countyName);// Bharath
		System.out.println("Jersey No  :" + r.jerseyno);// 45
		System.out.println("Cricketer name : " + r.name);// Rohit

		System.out.println("************Object4 info !");
		Cricketer j = new Cricketer();
		j.jerseyno = 8;
		j.name = "Jadeja";
		System.out.println("Country ID : " + countryId);// 92
		System.out.println("Country Name : " + countyName);// BHarath
		System.out.println("Jersey No  :" + j.jerseyno);// 0
		System.out.println("Cricketer name : " + j.name);// null

		System.out.println("************Object5 info !");
		Cricketer g = new Cricketer();
		g.jerseyno = 43;
		g.name = "Jadeja";
		System.out.println("Country ID : " + countryId);//
		System.out.println("Country Name : " + countyName);//
		System.out.println("Jersey No  :" + g.jerseyno);//
		System.out.println("Cricketer name : " + g.name);//

		System.out.println("************Object6 info !");
		Cricketer h = new Cricketer();
		System.out.println("Country ID : " + countryId);//
		System.out.println("Country Name : " + countyName);//
		System.out.println("Jersey No  :" + h.jerseyno);//
		System.out.println("Cricketer name : " + h.name);//
	}
}
