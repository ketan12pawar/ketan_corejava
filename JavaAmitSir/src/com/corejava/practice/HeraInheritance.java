
package com.corejava.practice;
import java.util.Scanner;

class Heraroot{
    Scanner sc = new Scanner(System.in);
    int a,b;
    void getdata()
    {
        System.out.println("Enter the two number");
        a = sc.nextInt();
        b = sc.nextInt();
    }
}
class Heraadd extends Heraroot{
    int c;
    void addition()
    {
        c = a+b;
        System.out.println("Addition:"+c);
    }
}
class Herasub extends Heraroot{
    int c;
    void substraction()
    {
        c = a-b;
         System.out.println("Substraction:"+c);

    }
}
public class HeraInheritance {
    public static void main(String[] args) {
        Heraadd ha = new Heraadd();
        Herasub hs = new Herasub();
         ha.getdata();
        ha.addition();
        hs.getdata();
        hs.substraction();
    }
    
}
