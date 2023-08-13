package com.corejava.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	public static void main(String args[]) {
		ArrayList<Integer> ai = new ArrayList<>();
		ai.add(65);
		ai.add(85);
		ai.add(58);
		ai.add(70);
		System.out.println(ai);
		Collections.sort(ai);
		System.out.println(ai);
	}

}
