package com.corejava.chaptr2;

//Name of the method should be same.
//Parameters should be different.
//They should belong to same class

public class Methodoverloading {
	int c;
	
	public void addition(){
		int a=10,b=20;
		System.out.println("sum of a and b:"+ (a+b));
	}
	
	public void addition(int a,int b){
		System.out.println(a+b);
	}
	
	public int addition(int a,int b,int c){
		return a+b+c;
	}
	
	public static void main(String[] args){
		
		int arg1 = Integer.parseInt(args[0]);
		int arg2 = Integer.parseInt(args[1]);
		
		System.out.println("User entered arg1 = "+arg1);
		System.out.println("User entered arg2 = "+arg2);
		
		Methodoverloading obj = new Methodoverloading();
		obj.addition();
		obj.addition(arg1,arg2);
		int ret= obj.addition(10, 20, 30);
		System.out.println(ret);
	}

}



