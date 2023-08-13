package com.corejava.practice;

public class Equals {
	int a,b,c;
	Equals(){
		a=10;
		b=20;
		c=a+b;
		System.out.println("Addition:"+c);
	}
	public static void main(String args[]) {
		System.out.println("First Object");
		Equals eq=new Equals();
		System.out.println("Second Object");
		Equals eq1=new Equals();
		System.out.println(eq.equals(eq));
	}

}
