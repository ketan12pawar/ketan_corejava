package com.infy.cgtrng;

public class RemoveWhiteSpaces {
	public static void main(String[] args)
    {
        String str = " Hello How Are You   ";
 
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
 
        System.out.println(str);
    }

}
