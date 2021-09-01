package com.corejava.kp;

   public class ConstructorDemo {
	   
	   int x;
	   ConstructorDemo() {
		   x=10;
		   //System.out.println(This is a constructor value:" +a);
		   
	   }
	 public static void main (String[] args ) {
		 //Constructor is invoke when you initialize an object
		 ConstructorDemo t1 = new ConstructorDemo();
		 ConstructorDemo t2 = new ConstructorDemo();
		 //you do not have to explicitly call constructor unlike methods
		 System.out.println(t1.x +" "+ t2.x);
		 
	 }

}
