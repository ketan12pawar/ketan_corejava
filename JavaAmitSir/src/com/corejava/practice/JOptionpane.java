
package com.corejava.practice;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionpane {
	public static void main(String args[]) {
		JFrame f = new JFrame(); 
		JOptionPane.showMessageDialog(f, "Frame open after dialog box");
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
