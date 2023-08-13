package com.corejava.practice;

import java.util.TreeSet;

public class Treeset {
	public static void main(String args[]) {
		TreeSet <String> ts = new TreeSet<>();
		ts.add("Ram");
		ts.add("Rajesh");
		ts.add("Rakesh");
		ts.add("Sita");
		ts.add("Bablu");
		ts.add("Vaibhav");
		ts.add("Durgesh");
		System.out.println(ts);
		
		System.out.println("Remove first:"+ts.pollFirst());
		System.out.println(ts);
		
		System.out.println("Remove last:"+ts.pollLast());
		System.out.println(ts);
		
		System.out.println(ts.descendingSet());
		System.out.println(ts.headSet("Rajesh",false));
		System.out.println(ts.tailSet("Rajesh",false));
		System.out.println(ts.subSet("Durgesh",false,"Ram",true));
		
		
	}

}
