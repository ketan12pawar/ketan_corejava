package com.corejava.practice;

import java.util.ArrayList;

public class ArrayListSecond {
	public static void main(String args[]) {
		ArrayList al = new ArrayList() ;
		al.add("Ram");
		al.add("Nita");
		al.add(58);
		String s = (String) al.get(0);
		String s1 = (String) al.get(1);
		int a = (Integer) al.get(2);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(a);
	}

}
