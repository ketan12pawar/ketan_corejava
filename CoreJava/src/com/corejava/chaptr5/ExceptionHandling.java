package com.corejava.chaptr5;

public class ExceptionHandling {
	public static void main(String[] args){
		int x = 10;
		int y = 0;
		try {

			// example of Arithmetic Exception
			int num = x/y;
			System.out.println("next statement: inside try block");

		}catch (Exception e){
			System.out.println("Exception");
			
		}
		finally {
			System.out.println("next statement: outside try block");
		}

	}

}
