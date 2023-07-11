package com.corejava.practice;
class Method1{
    void display(){
        System.out.println("Super class method");

    }
}
class Method2 extends Method1{
    void display()
    {
       System.out.println("Sub class method");
    }
     
}
    
public class MethodOverriding {
    public static void main(String[] args) {
        Method1 meth1 = new Method1();
        meth1.display();
        Method2 meth2 = new Method2();
        meth2.display();     
    }
    
}
