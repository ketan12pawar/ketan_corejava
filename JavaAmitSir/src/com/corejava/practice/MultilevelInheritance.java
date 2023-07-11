package com.corejava.practice;
import java.util.Scanner;

class Multiemp{
    Scanner sc = new Scanner(System.in);
    int empno,Salary;
    void getdata()
    {
       System.out.println("Enter the employee no");
       empno = sc.nextInt();
       System.out.println("Enter the employee Salary");
       Salary = sc.nextInt();

    }
}
class Multiempda extends Multiemp{
    int da,hra,pf;
    void getda()
    {
        da=(Salary*140)/100;
        hra=(Salary*40)/100;
        pf=(pf*15)/100;

    }
}
class Multiempfinal extends Multiempda{
    int total;
    void calculate()
    {
        total = Salary + da + hra - pf;
    }
    void display()
    {
       System.out.println("------------------ Salary Slip----------------");
       System.out.println("Employee no:"+empno);
       System.out.println("Employee Salary:"+Salary);
       System.out.println("DA:"+da);
       System.out.println("HRA:"+hra);
       System.out.println("PF:"+pf);
        System.out.println("------------------");
         System.out.println("Total Salary:"+total);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Multiempfinal mef = new Multiempfinal();
        mef.getdata();
        mef.getda();
        mef.calculate();
        mef.display();
    }
    
}
