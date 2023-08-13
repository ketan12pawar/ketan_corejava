package com.corejava.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Bufferwriter {
	public static void main(String[] args) {
		try{
			FileWriter fw = new FileWriter("demo1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String str = "welcome to buffer writer class";
			bw.write(str);
			System.out.println("file created");
			fw.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
