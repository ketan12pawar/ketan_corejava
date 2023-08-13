package com.corejava.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhasmap {
	public static void main(String args[]) {
		LinkedHashMap <Integer,String> lmap = new LinkedHashMap<>();
		lmap.put(100,"Amit");
		lmap.put(101,"Ram");
		lmap.put(102,"Sita");

		for(Map.Entry m:lmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

		System.out.println(lmap.keySet());
		System.out.println(lmap);


	}

}
