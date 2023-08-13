package com.corejava.practice;

import java.util.Stack;

public class StackFirst {
	public static void main(String args[]) {
		Stack <String> st = new Stack<>();
		System.out.println("Empty or not:"+st.empty());
		System.out.println(st);
		
		st.push("Bhopal");
		st.push("Indore");
		st.push("Dewas");
		st.push("Ujjain");
		System.out.println(st);
		
		st.pop();
		System.out.println("Elements pop:"+st);
		System.out.println("Peek elements:"+st.peek());
		System.out.println("Empty or not:"+st.empty());
		st.push("Khandwa");
		System.out.println("Peek element:"+st.peek());
		System.out.println("Elements pop:"+st);
		System.out.println("Search:"+st.search("Bhopal"));
		
		
		
	}

}
