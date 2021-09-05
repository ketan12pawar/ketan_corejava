package com.corejava.kp;

class Name {
	String FirstName;
	String MiddleName;
	String LastName;
	 
	public Name(String fname, String mname, String lname) {
		this.FirstName = fname;
		this.MiddleName = mname;
		this.LastName = lname;
		
	}
}    
    public class EmployeeExam1{
    	int age;
    	Name n;
    	  public void display(int age, Name n) {
    		  System.out.println("Age: "+age);
    		  System.out.println("Full: "+n.FirstName+" "+n.MiddleName+" "+n.LastName);
    		  
    	  } 
    	     public static void main(String[] args) {
    	    	 EmployeeExam1 e = new EmployeeExam1();
    	    	 Name n = new Name("Monica","Mittal", "Agarwal");
    	    	 e.display(50, n);
    	    	 
    	     }
    	
    }
   
