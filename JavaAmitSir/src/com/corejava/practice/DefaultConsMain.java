
package com.corejava.practice;
import java.util.Scanner;
class DefaultCons {
    String iname,Sname;
    int regno;
    Scanner sc =  new Scanner (System.in);
    DefaultCons()
    {
        iname="Universal";
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
class DefaultConsMain{
    public static void main(String[] args) {
        DefaultCons de = new DefaultCons();
        de.get_value();
        DefaultCons del = new DefaultCons();
        del.get_value();
        de.display();
        del.display();
    }
}
