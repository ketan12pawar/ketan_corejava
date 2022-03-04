package com.corejava.chaptr5;

public class ExceptionHandling {
	public static void main(String[] args){
		int x = 10;
		int y = 20;
		try {
			int num = y/x;
			System.out.println("next statement: inside try block");
		}
		catch (Exception exceptionhandling){
			System.out.println("Exception");
		}
		finally {
			System.out.println("next statement: outside try block");
		}
	}

}
