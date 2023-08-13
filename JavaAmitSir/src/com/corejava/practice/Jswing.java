package com.corejava.practice;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jswing {
	Jswing(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton b1 = new JButton("YES");
		panel.setBackground(Color.red);
		b1.setBounds(150,100,250,250);
		b1.setBackground(Color.yellow);
		panel.setBounds(10,10,790,790);
		frame.setSize(800,800);
		frame.setVisible(true);
		frame.setLayout(null);
		panel.add(b1);
		frame.add(panel);
	}
	public static void main(String args[]) {
		new Jswing();
	}

}
