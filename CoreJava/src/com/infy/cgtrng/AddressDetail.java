package com.infy.cgtrng;

import java.util.Scanner;

public class AddressDetail {
	public static void main (String[] args){
		Scanner Sc = new Scanner(System.in);

		String D, S, C;

		int zip;

		System.out.print("Enter Door No. : ");

		D = Sc.nextLine();

		System.out.print("Enter Street : ");

		S = Sc.nextLine();

		System.out.print("Enter City : ");

		C = Sc.nextLine();

		System.out.print("Enter ZIP C0de : ");

		zip = Sc.nextInt();

		System.out.println("\nDoor No. : " + D);

		System.out.println("Street : " + S);

		System.out.println("City : " + C);

		System.out.println("ZIP C0de : " + zip);
	}

}
