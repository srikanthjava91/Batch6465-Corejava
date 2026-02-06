package com.collectionsframework;

import java.util.Map;
import java.util.WeakHashMap;


//NOte : HashMap is dominating Garbage Collection, Where Garbage Collector dominating WeakHashMap.

class Temp {

	@Override
	public String toString() {

		return "Temp";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}
}

public class TestMapDemo5 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started !");
		Temp s = new Temp();

		Map<Object, String> m1 = new WeakHashMap<>();
		m1.put(s, "Srikanth");
		System.out.println(m1);

		s = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m1);

	}

}
