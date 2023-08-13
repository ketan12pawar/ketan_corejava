package com.corejava.practice;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.List;

public class Form1 {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(800, 600);
        f.setTitle("My First Form");
        f.setLayout(new BorderLayout());
        
        TextField t1, t2, t3;
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t1.setBounds(150, 100, 175, 50);
        t2.setBounds(150, 200, 175, 50);
        t3.setBounds(150, 300, 175, 50);

        Label l1, l2;
        l1 = new Label("First No");
        l2 = new Label("Second No");
        l1.setBounds(20, 100, 50, 50);
        l2.setBounds(20, 200, 50, 50);

        Checkbox c1, c2, c3, c4;
        c1 = new Checkbox("Home");
        c2 = new Checkbox("Bike");
        c3 = new Checkbox("Car");
        c4 = new Checkbox("Credit Card");
        c1.setBounds(20, 400, 70, 50);
        c2.setBounds(100, 400, 70, 50);
        c3.setBounds(170, 400, 70, 50);
        c4.setBounds(250, 400, 100, 50);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox ch1, ch2, ch3;
        ch1 = new Checkbox("Male", cbg, true);
        ch2 = new Checkbox("Female", cbg, false);
        ch3 = new Checkbox("Other", cbg, false);
        ch1.setBounds(20, 500, 70, 50);
        ch2.setBounds(100, 500, 70, 50);
        ch3.setBounds(170, 500, 70, 50);

        Button b1 = new Button("YES");
        Button b2 = new Button("NO");
        b1.setBounds(70, 450, 100, 40);
        b2.setBounds(170, 450, 100, 40);

        Choice co = new Choice();
        co.setBounds(270, 500, 150, 40);
        co.add("Indore");
        co.add("Khandwa");
        co.add("Dewas");
        co.add("Ujjain");

        List li = new List();
        li.setBounds(300, 500, 100, 40);
        li.add("Indore");
        li.add("Khandwa");
        li.add("Dewas");
        li.add("Ujjain");
        li.add("Bhopal");

        f.add(li, BorderLayout.CENTER);
        f.add(co, BorderLayout.NORTH);
        f.add(t1, BorderLayout.WEST);
        f.add(t2, BorderLayout.EAST);
        f.add(t3, BorderLayout.SOUTH);
        f.add(l1);
        f.add(l2);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(ch1);
        f.add(ch2);
        f.add(ch3);
        f.add(b1);
        f.add(b2);
    }
}