package com.corejava.practice;

import java.io.FileReader;

public class Filereader {
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("demo1.txt");
			int i;
			while((i=fr.read())!=-1){
				System.out.println((char)i);
			}
			fr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
