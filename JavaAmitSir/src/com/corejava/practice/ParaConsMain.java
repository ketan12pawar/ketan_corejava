package com.corejava.practice;
import java.util.Scanner;
class ParaCons {
    String iname,Sname;
    int regno;
    Scanner sc =  new Scanner (System.in);
    ParaCons(String ins)
    {
        iname="ins";
    }
     void get_value()
     {
        System.out.println("Enter the student name");
        Sname = sc.nextLine();
        System.out.println("Enter the Registration no");
        regno = sc.nextInt();
     }
     void display()
     {
        System.out.println("Student name:" +Sname);
         System.out.println("Student Regno:" +regno);
          System.out.println("Student institute name:" +iname);
        
     }
}
class ParaConsMain{
    public static void main(String[] args) {
        ParaCons pa = new ParaCons("universal");
        pa.get_value();
        ParaCons pa1 = new ParaCons("Ram");
        pa1.get_value();
        pa.display();
        pa1.display();
    }
}
