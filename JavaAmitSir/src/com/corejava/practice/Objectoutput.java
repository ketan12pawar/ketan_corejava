package com.corejava.practice;

import java.io.*;
class Student1 implements Serializable{
	int rollno;
	float per;
	Student1(int r, float p){
		rollno= r;
		per= p;
	}
}
class Objectoutput{
	public static void main(String[] args) {
		try{
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream OOS = new ObjectOutputStream(fos);
			Student1 st = new Student1(101, 45.6f);
			OOS.writeObject(st);
			System.out.println("file created");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}