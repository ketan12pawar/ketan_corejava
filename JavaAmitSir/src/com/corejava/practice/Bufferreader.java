package com.corejava.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Bufferreader {

	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("demo1.txt");
			BufferedReader br = new BufferedReader(fr);
			int i;
			while((i=br.read())!= -1){
				System.out.println((char)i);
			}
			br.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
