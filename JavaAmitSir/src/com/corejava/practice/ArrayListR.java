package com.corejava.practice;

import java.util.ArrayList;

public class ArrayListR {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Dewas");
		al.add("Indore");
		al.add("Ujjain");
		al.add("Betul");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		int x = al.indexOf("Ujjain");
		System.out.println(al);

	}
}
