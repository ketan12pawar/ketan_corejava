package com.infy.cgtrng;

import java.util.Scanner;
 
public class SumOfEven {
	public static void main(String [] args) {
		int Size, i, EvenSum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of  Element in Array");
		Size = sc.nextInt();

		int [] a = new int[Size];

		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 0)
			{
				EvenSum = EvenSum + a[i]; 
			}
		}		
		System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
	}

}


