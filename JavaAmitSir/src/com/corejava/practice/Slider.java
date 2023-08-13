package com.corejava.practice;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Slider {
	public static void main(String args[]) {
		JFrame f = new JFrame();
		f.setSize(400,400);
		JSlider sl = new JSlider(JSlider.HORIZONTAL,0,50,25);
		sl.setMinorTickSpacing(2);
		sl.setMajorTickSpacing(10);
		sl.setPaintTicks(true);
		sl.setPaintLabels(true);
		JPanel p =new JPanel();
		p.add(sl);
		f.add(p);
		f.setVisible(true);
		
	}

}
