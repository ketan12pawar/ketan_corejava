package com.corejava.kp;

import java.util.Date;

public class TimeDelay {
	
	public static void main(String[] args ) {
		try {
			  System.out.println(new Date( ) + "\n");
			  Thread.sleep(1000);
			  System.out.println(new Date( ) + "\n");
			  
			  
		}
		   catch (Exception e) {
			   System.out.println("Got an exception");
			   System.out.println(e);
		
			   
		}
		
	}
	

}
