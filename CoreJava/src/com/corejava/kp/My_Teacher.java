package com.corejava.kp;


class Person2{//A
	
}
  class Employee2 extends Person2{ // B extends A
	  
  }
   
   class Teacher extends Person2{ // C extends A
	   
   }
   
    class Maths_Teacher extends Teacher{ // D extends C
    	
    
    
       public static void main (String[] args ) {
    	   Employee2 e = new Employee2();
    	   Teacher t = new Teacher();
    	   Maths_Teacher m = new Maths_Teacher(); // Maths_Teacher extends Person
    	   
    	   
    	   System.out.println(e instanceof Person2);
    	   System.out.println(t instanceof Person2);
    	   System.out.println(m instanceof Teacher);
    	   System.out.println(m instanceof Person2);
    	   
       }
       
       
    }
