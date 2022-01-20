package com.corejava.kp;

public class methodoverloading {
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
	methodoverloading obj = new methodoverloading();
		 obj.addition();
		 obj.addition(10,20);
		 int ret= obj.addition(10, 20, 30);
		 System.out.println(ret);
	 }

}
