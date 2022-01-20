package com.corejava.kp;

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
 public class Testdog{
	 public static void main(String[]args){
		 Animal a = new Animal();
		 a.display();
		 Animal b = new Dog();
		 b.display();
	 }
 }