package com.corejava.chaptr3;

public class Studentsrecords {

	public String name ;
	String division;
	private int age;

	public Studentsrecords(String sname){
		name = sname;

	}
	public void setDiv(String sdiv){
		division = sdiv;

	}
	public void setAge(int sage){
		age = sage;

	}
	public void printstud(){
		System.out.println("Student Name: " + name);
		System.out.println("Student Division: " + division);
		System.out.println("Student Age: " + age);
	}
	public static void main(String [] args){
		Studentsrecords s = new Studentsrecords("Monica");
		s.setAge(16);
		s.setDiv ("A");
		s.printstud();
	}
}


