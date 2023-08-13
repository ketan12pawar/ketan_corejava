package com.corejava.practice;

import java.util.LinkedList;

public class LinkedListFirst {
	public static void main(String args[]) {
		LinkedList <String> List = new LinkedList <>();
		List.add("Dewas");
		List.add("Indore");
		List.add("Ujjain");
		
	System.out.println(List);
	
	LinkedList <String> List1 = new LinkedList <>();
	List1.add("Dewas");
	List1.add("Indore");
	List1.add("Ujjain");
	List1.add("Kota");
	
   System.out.println(List1);
   List1.add(2,"Swaimadhpur");
   
   List.addAll(1, List1);
   System.out.println(List1);
   
   List.remove(List1);
   System.out.println(List);
   System.out.println(List1);
   
	
	
	
	}

}
