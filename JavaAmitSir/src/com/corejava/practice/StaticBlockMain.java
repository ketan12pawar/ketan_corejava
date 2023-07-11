 /// StaticBlock -: It is used to initialize the data member
package com.corejava.practice;
 class StaticBlock{
    static int i;
    void display()
    {
        System.out.println(i);
    }
   static {
        System.out.println("Static block execute");
        i=100;
    }
}
 
public class StaticBlockMain {
    public static void main(String[] args) {
        StaticBlock st = new StaticBlock();
        System.out.println("Main method execute");
        st.display();
    }
    
}

