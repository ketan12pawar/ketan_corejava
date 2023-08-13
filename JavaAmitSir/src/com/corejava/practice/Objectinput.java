package com.corejava.practice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Objectinput {
	public static void main(String[] args) {
		try{
			FileInputStream fos = new FileInputStream("student.txt");
			ObjectInputStream OOS = new ObjectInputStream(fos);
			Student1 st =  (Student1)OOS.readObject();
			System.out.println("Rollno :" + st.rollno + "\n percentage :" +st.per);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
