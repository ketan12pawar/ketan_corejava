package com.corejava.chaptr2;

public class Maths{
	
	int z = 0;
	
	// This will be the starting point of the program
	public static void main(String args []){
		
		// creating objcet
		Maths obj1 = new Maths();
		
		// calling the method 
		int l = obj1.sumOfNumber(50, 40);
		
		System.out.println("*******Sum of number*******" + l);
		
	/*	 int p = obj1.multiplicationOfNumber(50, 10);
		 System.out.println("*******Sum of number*******" + p);*/
		
		int p = Maths.multiplicationOfNumber(50,30);
		System.out.println("*******Sum of number*******" + p);
	}
	
	
	
	public int sumOfNumber(int x, int y){
		
		int sum = x + y;
		
		return sum;
		
	}
	
	 public static int multiplicationOfNumber (int x ,int y){
		 int multiplication = x * y;
		 return multiplication;
	 }
	


	 
	
	
}
