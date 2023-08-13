package com.corejava.practice;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Jtabbed {
	JFrame Frame;
	Jtabbed(){
		Frame = new JFrame();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JTextArea ta = new JTextArea(100,100);
		ta.setBackground(Color.blue);
		JTabbedPane jt = new JTabbedPane();
		jt.setBounds(50,50,200,200);
		panel1.add(ta);
		jt.add("Main",panel1);
		jt.add("Visit",panel2);
		jt.add("Help",panel3);
		Frame.setSize(400,400);
		Frame.setVisible(true);
		Frame.setLayout(null);	
		Frame.add(jt);
	}

	public static void main(String args[]) {
		new Jtabbed();
	}

}
