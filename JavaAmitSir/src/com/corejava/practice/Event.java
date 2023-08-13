package com.corejava.practice;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event  extends Frame implements ActionListener {
    TextField t1,t2;
    Event(){
    	setVisible(true);
    	setSize(600,600);
    	setTitle("Value change Form");
    	setLayout(null);
    	
    	t1=new TextField("t1");
    	t2=new TextField("t2");
    	 
    	t1.setBounds(100,100,175,50);
    	t2.setBounds(100,200,175,50);
    	
    	Button b1=new Button("Transfer");
   	    b1.setBounds(100,500,175,50);
   	    b1.addActionListener(this);
   	    add(t2);
   	    add(t1);
   	    add(b1);
    	
    }
    public void actionPerformed(ActionEvent e) {
    	String str =t1.getText();
    	t1.setText(t2.getText());
    	t2.setText(str);
    	
    }
    public static void main(String args[]) {
    	new Event();
    }
}
