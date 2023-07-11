package com.corejava.practice;
public class CommandLine1 {
    public static void main(String[] args) {
        int a,i,sum=0;
        for(i=0;1<args.length;i++){
            a=Integer.parseInt(args[i]);
            sum = sum +a;

        }
        System.out.println("Sum of no:"+sum);
    }
    
}
