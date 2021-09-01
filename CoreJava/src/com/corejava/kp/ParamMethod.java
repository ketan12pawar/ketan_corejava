package com.corejava.kp;

   public class ParamMethod {
	   public static void main(String[] args) {
		   int a = 30;
		   int b = 45;
		   System.out.println("Before swapping, a = " + a + " and b = " + b);
		   
		   // Invoke the  swap method 
		   swapFunction(a, b);
		   
	   } 
	      public static void swapFunction(int n1, int n2) {
	    	  
	    	  //  swap n1 with n2 
	    	  int n3 = n1;//n3=a(30); n1=b(45); n2 is empty
	    	  n1 = n2;
	    	  n2 = n3; // n3 = 30 will move to n2// n1 = 45 n2 = 30 n3 is empty
	    	  System.out.println(" After swapping (inside), a = " + n1 + " b = " + n2);
	    	  
	      }

}
