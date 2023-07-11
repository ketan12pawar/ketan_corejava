package com.corejava.practice;
import java.util.Scanner;

class Copycons{
    int itemno, price;
    Scanner sc =  new Scanner(System.in);
    Copycons(int i, int p){
        itemno=i;
        price=p;
    }
    Copycons(Copycons cy)
    {
        itemno=cy.itemno;
        price=cy.price;
    }
    void show()
    {
       System.out.println("Itemno:" + itemno);
       System.out.println("Price:" + price);
    }
    
}
public class CopyConsMain 
{
    
    public static void main(String args[])
    {
        Copycons cc = new Copycons(101,33);
        System.out.println("First object");
        cc.show();
        System.out.println("Second object");
        Copycons cc1 = new Copycons(cc);
        cc1.show();
        

    }
}
