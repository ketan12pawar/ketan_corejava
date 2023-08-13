package com.corejava.practice;

import java.util.LinkedHashSet;

class Student {
    int rollno, marks;
    String name;

    void getdata(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }
}

public class Linkedhasset {
    public static void main(String args[]) {
        Student st = new Student();
        Student st1 = new Student();
        Student st2 = new Student();
        st.getdata(101, 200, "Amit");
        st1.getdata(101, 200, "Sita");
        st2.getdata(101, 200, "Gita");
        
        LinkedHashSet<Student> lhs = new LinkedHashSet<Student>();
        lhs.add(st);
        lhs.add(st1);
        lhs.add(st2);
        
        for (Student s : lhs) {
            System.out.println(s.rollno + " " + s.marks + " " + s.name);
        }
    }
}
