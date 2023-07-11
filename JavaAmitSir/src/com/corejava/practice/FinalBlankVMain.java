/// Final Keyword -: Final is used where we can't change value.
/// Final variable -: If we declare a variable final we can initialize it through constructor.
package com.corejava.practice;
class FinalBlankV{
    final int a;
    final static int b;
    FinalBlankV()
    {
        a=10;
        System.out.println(a);
    }
    static {
        b=100;
        System.out.println(b);
    }
}
public class FinalBlankVMain {
    public static void main(String[] args)  {
        FinalBlankV fv = new FinalBlankV();
        
    }
}
