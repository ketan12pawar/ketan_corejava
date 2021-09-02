package com.corejava.kp;

class Calculation {
	
	int c;
	
	public void addition(int a, int b) {
		c = a+b;
		System.out.println("The sum of the given numbers;"+c);
		
	}
	
	 public void Subtraction(int a, int b) {
		 c = a-b;
		 System.out.println("The difference between the given numbers:"+c);
		 
	 }

}
  public class My_Calculation extends Calculation {
	  
	  public void multiplication(int a, int b) {
		  c = a*b;
		  System.out.println("The product of the given numbers:"+c);
		  
	  }
	    public static void main(String[] args) {
	    	My_Calculation demo = new My_Calculation();
	    	int a = 20, b = 10;
	    	demo.addition(a, b);
	    	demo.Subtraction(a, b);
	    	demo.multiplication(a, b);
	    	
	    			
	    }
	  
  }














