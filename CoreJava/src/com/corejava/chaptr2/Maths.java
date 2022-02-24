package com.corejava.chaptr2;

public class Maths{
	
	int z = 0;
	
	// This will be the starting point of the program
	public static void main(String args []){
		
		// creating objcet
		Maths obj1 = new Maths();
		
		// calling the non static method
		// with object
		int l = obj1.sumOfNumber(50, 40);
		
		System.out.println("*******Sum of number*******" + l);

		//calling static method with just class name directly
		//object creation not needed.
		int p = Maths.multiplicationOfNumber(50,30);
		
		System.out.println("*******Sum of number*******" + p);
	}
	
	
	// this is non static method
	// this would require a class object to call this
	public int sumOfNumber(int x, int y){
		
		int sum = x + y;
		
		return sum;
		
	}
	// whenever we want to call a method directly by class name we use static keyword
	 public static int multiplicationOfNumber (int x ,int y){
		 int multiplication = x * y;
		 return multiplication;
	 }
	


	 
	
	
}
