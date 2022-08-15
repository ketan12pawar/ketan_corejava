package com.infy.cgtrng;


abstract class Car{  
	abstract void accelerate();  
}  

class Suzuki extends Car{  
	void accelerate(){
		System.out.println("Suzuki::accelerate");

	}
}
public class Abstraction {
	public static void main(String args[]){  
		Car obj = new Suzuki();    
		obj.accelerate();          
	}
}
