package com.corejava.practice;

import java.util.LinkedList;

public class LinkedListSecond {
	public static void main(String args[]) {
		LinkedList <String> List = new LinkedList <>();
		List.add("Dewas");
		List.add("Indore");
		List.add("Ujjain");
		List.add("Bhopal");
		
	System.out.println(List);
	
	List.addFirst("Bhopal");
	System.out.println(List);
	
	List.addLast("Indore");
	System.out.println(List);
	
	List.removeFirstOccurrence("Indore");
	System.out.println(List);
	
	List.removeLastOccurrence("Bhopal");
	System.out.println(List);
	
	
	}

}
