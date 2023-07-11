package com.corejava.practice;

import java.util.Scanner;
class Shape{
Scanner sc=new Scanner(System.in);
int r, bb, hh, ba;
float he, ar;
void area(){
System.out.println("Enter the radius");
r=sc.nextInt();
ar= 3.14f*r*r;
System.out.println("Area of circle:"+ ar);
}
void area(int b, int h){
bb=b;
hh=h;
ar=bb*hh;
System.out.println("Area of Rectangle:"+ ar);
}
void area(int base, float height){
ba=base;
he=height;
ar=1f/2f*ba*he;
System.out.println("Area of Triangle:"+ ar);
}
}
class MethodOverloading{
public static void main(String []args){
Shape sh= new Shape();
Scanner sc =new Scanner(System.in);
int l, b, h;
float he;
System.out.println("Enter the length and breadth for rectangle");
l=sc.nextInt();
b=sc.nextInt();
System.out.println("Enter the base and height for triangle");
b=sc.nextInt();
he=sc.nextInt();
sh.area();
sh.area(l, b);
sh.area(b, he);
}
}
