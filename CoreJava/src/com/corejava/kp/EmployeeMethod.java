package com.corejava.kp;

class PersonMethod {
	String name = "Monica";
	public void display() {
		System.out.println("This is Super Class");
		
		
	}

}
 public class EmployeeMethod extends PersonMethod {
	 String name = "Sameer";
	 
	 
	  public void display() {
		  System.out.println("Super class name: "+super.name);
		  System.out.println("Sub class name: "+name);
		  
		  
	  }
	     public void finalDisplay() {
	    	 
	    	 super.display();
	    	 
	     }
	       public static void main(String[] args) {
	    	   EmployeeMethod e = new EmployeeMethod();
	    	   e.display();//this will call the subclass method
	    	   e.finalDisplay();//this will call the superclass method
	       }
 }
