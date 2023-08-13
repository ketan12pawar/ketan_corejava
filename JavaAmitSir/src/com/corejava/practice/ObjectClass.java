package com.corejava.practice;

public class ObjectClass {
	String name;
	float per;
	int rollno;
	
	ObjectClass(int r, String ch, float p){
		rollno=r;
		name=ch;
		per=p;
		
	}
	public String toString() {
		return rollno+" "+name+" "+" "+per;
		
	}
	
	public static void main(String args[]) {
		 ObjectClass ob = new ObjectClass(111,"RAM",76.8f);
		 System.out.println(ob.toString());
		 System.out.println(ob.hashCode());
		 System.out.println(ob.getClass());
		 System.out.println(ob.getClass().getName());
		 
		 
	}

}
