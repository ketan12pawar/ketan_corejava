package com.corejava.practice;

import java.util.LinkedList;

public class LinkedLIstThird {
	public static void main(String args[]) {
		LinkedList <String> List = new LinkedList <>();
		List.add("Dewas");
		List.add("Indore");
		List.add("Ujjain");
		List.add("Bhopal");
		
	System.out.println(List.peekFirst());
	System.out.println(List);
	
	System.out.println(List.peekLast());
	System.out.println(List);
	
	System.out.println(List.pollFirst());
	System.out.println(List);
	
	System.out.println(List.pollLast());
	System.out.println(List);
	
	}
}
