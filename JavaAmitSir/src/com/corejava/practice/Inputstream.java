package com.corejava.practice;

import java.io.FileInputStream;

public class Inputstream {
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("demo.txt");
			int i;
			while((i=fis.read())!= -1){
				System.out.println((char)i);
			}
			fis.close();
		}
		catch(Exception e){
			{
				System.out.println(e);
			}
		}
	}

}
