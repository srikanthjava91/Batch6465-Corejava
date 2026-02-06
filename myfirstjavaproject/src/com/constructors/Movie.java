package com.constructors;

public class Movie {

	String name;
	String hero;
	String heroine;
	String director;
	double budget;

	public Movie(String director) {
		System.out.println("one arg constructor ");
		this.director = director;
	}

	Movie(Movie m, String hero, double budget) {
		System.out.println("two arg h b constructor ");
		this.director = m.director;
		this.hero = hero;
		this.budget = budget;
	}

	public Movie(Movie m, String heroine, String name) {
		this.director = m.director;
		this.hero = m.hero;
		this.budget = m.budget;
		this.name = name;
		this.heroine = heroine;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Movie m = new Movie("Sujith");
		m.show();

		Movie m1 = new Movie(m, "Power Star Pavan Kalyan", 250000000000.00);
		m1.show();

		Movie m2 = new Movie(m1, "Priyanka Mohan", "OG");
		m2.show();
	}

	void show() {
		System.out.println("Name of The Movie :" + name);
		System.out.println("Hero of the Movie : " + hero);
		System.out.println("Heroine of the Movie : " + heroine);
		System.out.println("Director of the Movie : " + director);
		System.out.println("Budget of the Movie : " + budget);
		System.out.println("*******************************");

	}

}
