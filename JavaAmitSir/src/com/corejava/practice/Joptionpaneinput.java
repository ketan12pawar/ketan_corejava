package com.corejava.practice;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Joptionpaneinput {
	public static void main(String args[]) {
		JFrame f = new JFrame(); 
String name	=JOptionPane.showInputDialog(f, "Enter the name");
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
