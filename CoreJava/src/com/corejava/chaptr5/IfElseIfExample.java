package com.corejava.chaptr5;

public class IfElseIfExample {
	// This will be t9he staring point of the program 
	public static void main(String[] args) {
		// Declaring variable
		int marks=65;
		// Applying condition 1
		
		if(marks<50){
			System.out.println("fail");
		}
		// Applying condition 2
		
		else if(marks>=50&& marks<60){
			System.out.println("D grade");
		}
		// Applying condition 3
		
		else if(marks>=60&& marks<70){
			System.out.println("C grade");
		}
		// Applying condition 4
		else if(marks>=70&& marks<80){
			System.out.println("B grade");
		}
		// Applying condition 5
		else if(marks>=80&& marks<90){
			System.out.println("A grade");
		} 
		// Applying condition 6
		else if(marks>=90&& marks<100){
			System.out.println("A+ grade");
				
		}
		// Applying condition 7
		
		else {
			System.out.println("Invalid");
		}
		
	}

}

// syntax

// if(condition1)
//{  
//code to be executed if condition1 is true  
 // }else if(condition2)
// {  
//code to be executed if condition2 is true  
// }  
//else if(condition3){  
//code to be executed if condition3 is true  
//  }  
 
//else
// {  
//code to be executed if all the conditions are false  
// }  
