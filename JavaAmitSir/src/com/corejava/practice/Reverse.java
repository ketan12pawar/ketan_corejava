package com.corejava.practice;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		int n, s=0,a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No");
		n = sc.nextInt();
		while(n!=0) {
			a = n%10;
			n = n/10;
			s = s*10+a;
		}
		System.out.println("Reverse No:" + s);
	}

}
