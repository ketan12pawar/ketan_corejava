package com.corejava.chaptr2;

public class Student2 {
	 int id;  
	    String name;  
	    //creating a parameterized constructor  
	    Student2(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //method to display the values  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    Student2 s5 = new Student2(111,"Karan");  
	    Student2 s6 = new Student2(222,"Aryan");  
	    //calling method to display the values of object  
	    s5.display();  
	    s6.display();  
	   }  

}
