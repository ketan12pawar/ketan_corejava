package com.corejava.practice;

import java.util.PriorityQueue;

public class Priorityqueue {
	public static void main(String args[]) {
		PriorityQueue <String> queue = new PriorityQueue <>(); 
		queue.add("Bhopal");
		queue.add("Indore");
		queue.add("Khandwa");
		queue.add("Dewas");
		queue.add("Ujjain");
		System.out.println(queue);
		
		System.out.println(queue.element());
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.remove());
		System.out.println(queue);
	}

}
