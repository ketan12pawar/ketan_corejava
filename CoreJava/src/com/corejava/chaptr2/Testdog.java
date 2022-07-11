package com.corejava.chaptr2;

//Name of the method should be same.
//parameter should be same.
//They should belongs two different class having parent child relationship.

class Animal{
	public void display(){
		System.out.println("Animals can move");
	}
}
class Dog extends Animal{
	public void display(){
		System.out.println("Dogs can walk and run");
	}

}
public class Testdog {
	public static void main(String[]args){
		Animal a = new Animal();
		a.display();
		Animal b = new Dog();
		b.display();
	}

}



