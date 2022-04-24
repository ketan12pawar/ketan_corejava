package com.corejava.chaptr2;

import java.util.Scanner;

public class SumOfNumber {
	
	public static void main(String args[]){
		
		int x, y, sum;
		
		Scanner sc = new Scanner(System.in); // creating an scanner object.to get input from user at runtime.

		System.out.println("Enter the first number:");
		x = sc.nextInt();

		System.out.println("Enter the second number");
		y = sc.nextInt();

		sum = sum(x,y);
		System.out.println("The sum of two numbers x nad y is:" + sum );
	}
	// method that calculate sum

	public static int sum(int x, int y){
		int sum = x + y;		  
		return sum;
	}

}
