package com.collectionsframework;

import java.util.LinkedList;
import java.util.Queue;

//FIFO
public class TestQueueDemo {

	public static void main(String[] args) {

		Queue<Integer> q1 = new LinkedList<>();

//		q1.offer(10);
//		q1.offer(40);
//		q1.offer(30);
//		q1.offer(20);
//		q1.offer(50);
//
//		System.out.println(q1.poll());
//		System.out.println(q1.peek());
//		System.out.println(q1);

		q1.add(10);
		q1.add(40);
		q1.add(30);
		q1.add(20);
		q1.add(50);
//
		System.out.println(q1.remove());
		System.out.println(q1.element());
		System.out.println(q1);//

	}

}
