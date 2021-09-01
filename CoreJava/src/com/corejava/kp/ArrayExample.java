package com.corejava.kp;

public class ArrayExample {
    public static void main(String[] args) {
    	
    	// Declaration
    	char[] myArray;
    	
    	// allocate memory for fixed number of integers
    	myArray = new char[5];
    	
    	// initialization
    	myArray[0] = 'H';
    	myArray[1] = 'e';
    	myArray[2] = 'l';
    	myArray[3] = 'l';
    	myArray[4] = '0';
    	
    	//To print an element stored in a particular index
    	System.out.println(myArray[1]);
    	//To print complete data from array
    	System.out.println(myArray);
    	
    	System.out.println(myArray.length);
    	
    	
    	double[] myList = {1.9,2.9,3.4,3.5};
    	
    	// print all the array elements in separate lines
    	for (int i = 0; i < myList.length; i++){
    		System.out.println(myList[i] +  " ");
    		
    	}
    	int[] mylist = {1,2,3,4,5};
    	//to total the value in mylist array
    	double total=0;
    	for(int i=0; i <mylist.length;i++){
    		total=total+mylist[i];
    		
    	}
    	System.out.println(total);    	    	    	    	    	   	 
}
}
