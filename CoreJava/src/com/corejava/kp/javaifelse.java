package com.corejava.kp;

import java.util.Scanner;

public class javaifelse {
	private static Scanner sc;

	public static void main (String args []) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		if (n % 2 == 1){
		System.out.println("Weird");
			
		}
		else
			if (n>=2 && n<=5){
				System.out.println("Not Weird");
			}
			else if (n>=6 && n<=20) {
				System.out.println("Weird");
			}
			else if (n>20) {
				System.out.println("Not Weird");
			}		
	}
}
	  