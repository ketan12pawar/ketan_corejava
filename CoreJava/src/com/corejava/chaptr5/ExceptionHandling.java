package com.corejava.chaptr5;

public class ExceptionHandling {
	public static void main(String[] args){
		int x = 10;
		int y = 0;
		try {

			// example of Artimetic Exception
			int num = x/y;
			System.out.println("next statement: inside try block");

		}catch (Exception e){
			System.out.println("Exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("next statement: outside try block");
		}

	}

}
