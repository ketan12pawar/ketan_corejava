package com.infy.cgtrng;

public class LeapYear {
	
	public static int[] findleapyears(int year) {
		int count = 0 , n = 0;
		int[] leapyears = new int  [15];
		while(n<15) {
			if(year%4==0 && (year%100!=0 || year%400==0)) {
				leapyears[n]+=year;
				n++;

			}
			year++;

		}

		return leapyears;
	}




	public static void main(String[] args) {
		int year = 2000;
		int[] leapYears;
		leapYears=findleapyears(year);
		for ( int index = 0; index<leapYears.length; index++ ) {
			System.out.println(leapYears[index]);
		}
	}
}