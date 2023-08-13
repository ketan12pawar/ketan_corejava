package com.corejava.practice;

interface Demo1{
	void display();
}
class Democlass implements Demo1{
	public void display(){
		System.out.println("implements the interface");
	}
}

class Interfacemain{
	public static void main(String []args){
		Democlass de= new Democlass();
		de.display();
	}
}
