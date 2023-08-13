package com.corejava.practice;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menubar {
	JMenu menu, submenu;
	JMenuItem i1,i2,i3,i4,i5;
	Menubar(){
		JFrame f = new JFrame("Menu and MenuItem Example");
		JMenuBar mb = new JMenuBar();
		  menu = new JMenu("File");
		  submenu = new JMenu("Print");
		i1 = new JMenuItem("New");
		i2 = new JMenuItem("Open");
		i3 = new JMenuItem("Save");
		i4 = new JMenuItem("Print preview");
		i5 = new JMenuItem("Page setup");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(submenu);
		submenu.add(i4);
		submenu.add(i5);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		}
	public static void main(String args[]) {
		new Menubar();
	}
	}


