package com.corejava.practice;
import java.util.Scanner;

class  StaticVariable{
   String ename;
   static String companyname = "IBM";
   int eno;
   Scanner sc = new Scanner(System.in);
   void get_data()
   {
    System.out.println("Enter the employee name");
    ename = sc.nextLine();
    System.out.println("Enter the employee no");
    eno = sc.nextInt();
   }
   void display()
   {
     System.out.println("employee name:"+ename);
     System.out.println("employee no:"+eno);
     System.out.println("company name:"+companyname);
   }
}
public class StaticVariableMain {
    public static void main(String args[]){
        StaticVariable sv = new StaticVariable();
        sv.get_data();
        sv.display();

    }
    
}
