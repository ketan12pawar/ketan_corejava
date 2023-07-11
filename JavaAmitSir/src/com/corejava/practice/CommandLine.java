package com.corejava.practice;
public class CommandLine {
    public static void main(String[] args) {
        int i;
        for(i=0; i<args.length;i++){
            System.out.println(args[i]);
        }
          System.out.println(args[0]);
          System.out.println(args[1]);
          System.out.println(args[2]);

    }
    
}
