package com.corejava.practice;
import java.util.Scanner;

class SingleABC{
    Scanner sc = new Scanner(System.in);
    private int a;
    int b;
    void getdata(){
        System.out.println("Enter the  two value");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    int get_a() {
        return a;
    }
}
    class SingleXYZ extends SingleABC{
        int c;
        void cal() {
            c = get_a() * b;
        }
        void show() {
             System.out.println("a:"+get_a());
              System.out.println("b:"+b);
               System.out.println("c:"+c);

        }
    }
public class SingleInheritance {
    public static void main(String[] args) {
        SingleXYZ single = new SingleXYZ();
        single.getdata();
        single.cal();
        single.show();

   }
    
}
