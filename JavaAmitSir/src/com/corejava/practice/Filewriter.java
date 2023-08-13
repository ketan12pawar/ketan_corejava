package com.corejava.practice;

import java.io.FileWriter;

public class Filewriter {
	public static void main(String[] args) {
		try{
			FileWriter fw = new FileWriter("demo1.txt");
			String str = " welcome to file handling";
			fw.write(str);
			System.out.println(" file created");
			fw.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
