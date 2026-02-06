package com.multithreading;

class BookMySeats {

	int totalTickets = 15;

	synchronized void bookMySeat(int seats) {

		if (seats <= totalTickets) {
			System.out.println("Tickets Booked Successfully : " + seats);
			totalTickets = totalTickets - seats;
			System.out.println("Remaining tickets availbility  : " + totalTickets);
		} else {
			System.out.println("Tickets have been sold out ");
			System.out.println("The availble tickets are : " + totalTickets);
		}

	}

}

public class BookMyShowApp extends Thread {
	static BookMySeats bookMySeats;
	int seats;

	@Override
	public void run() {
		bookMySeats.bookMySeat(seats);
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		bookMySeats = new BookMySeats();

		BookMyShowApp p1 = new BookMyShowApp();
		p1.seats = 5;
		p1.start();

		BookMyShowApp p2 = new BookMyShowApp();
		p2.seats = 8;
		p2.start();
		
		BookMyShowApp p3 = new BookMyShowApp();
		p3.seats = 5;
		p3.start();

	}

}
