package com.corejava.kp;

    public class ParameterizedConst { 
    	int a;
    	ParameterizedConst(int i){
    		a=i;
    		//System.out.println("This is a constructor value:" +a );
    	}
    	 public static void main(String[] args ){
    		 //Constructors is invoked when you initialize an object
    		 ParameterizedConst cd1 = new ParameterizedConst(10);
    		 ParameterizedConst cd2 = new ParameterizedConst(20);
    		 //you do not have to explicitly call constructor unlike methods
    		 System.out.println(cd1.a +" "+ cd2.a);
    		
    	}

}
