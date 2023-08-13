package com.corejava.practice;

import java.util.HashSet;

public class Hashset {
	public static void main(String args[]) {
		HashSet <String> hs = new HashSet<>();
		hs.add("Keyboard");
		hs.add("Barcode");
		hs.add("Mouse");
		hs.add("Scanner");
		System.out.println(hs);
		
		System.out.println(hs.contains("Scanner"));
		System.out.println(hs.isEmpty());
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
	}

}
