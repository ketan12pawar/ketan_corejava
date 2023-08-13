package com.corejava.practice;

import java.util.HashMap;

public class Hashmap {
	public static void main(String args[]) {
		HashMap <Integer,String> hash = new HashMap<>();
		hash.put(1,"Ram");
		hash.put(2,"Ramesh");
		hash.put(3,"Gita");
		hash.put(4,"Nita");
		hash.put(3,"Gitama");
		System.out.println(hash);
		System.out.println(hash.containsValue("Gita"));
	}

}
