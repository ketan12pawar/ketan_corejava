package com.infy.cgtrng;

import java.util.Scanner;

public class DoubleSum {
	public static void main(String [] args) {
		int fnum, snum, total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		fnum = sc.nextInt();
		System.out.println("Enter any Number");
		snum = sc.nextInt();

		if(fnum != snum) {
			total = (fnum + snum)*2;
			System.out.println("Total : " + total );

		}
		else {
			total = fnum + snum;
			System.out.println("Total : " + total);
		}

	}


}


