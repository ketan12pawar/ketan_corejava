package com.corejava.practice;
import java.util.Scanner;

class StaticM{
    String ename;
    static String cname="valuecaps";
    int eno;
    Scanner sc = new Scanner(System.in);
    void get_data()
    {
        System.out.println("Enter the employee name");
        ename=sc.nextLine();
        System.out.println("Enter the employee no");
        eno=sc.nextInt();
    }
    void display()
    {
        System.out.println("employee name:"+ename);
        System.out.println("employee number:"+eno);
        System.out.println("company name:"+cname);
    }
    static void change()
    {
        cname= "TCS";
    }
}
public class StatcMethodMain {
    public static void main(String[] args) {
        StaticM st = new StaticM();
        st.get_data();
        st.display();
        StaticM.change();
        st.display();
    }
    
}
