package com.corejava.practice;
class SuperVP{
    String color="RED";
}
class SuperVC extends SuperVP{
    String color="Green";
    void display(){
        System.out.println(super.color);
        System.out.println(color);
    }
}
public class SuperVmain {
    public static void main(String[] args) {
        SuperVC svc = new SuperVC();
        svc.display();
   
    }
    
}
