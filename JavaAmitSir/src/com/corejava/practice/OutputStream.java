package com.corejava.practice;

import java.io.FileOutputStream;

public class OutputStream {
	public static void main(String []args){
		try{
			FileOutputStream fos = new FileOutputStream("demo.txt");
			String str = " welcome to file handling";
			byte s[]= str.getBytes();
			fos.write(s);
			System.out.println(" file created");
			fos.close();
		}
		catch(Exception e){
			{
				System.out.println(e);
			}
		}
	}

}
