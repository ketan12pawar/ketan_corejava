package com.corejava.practice;

class Fact extends Thread{
	public void run(){
		int i;
		for(i=1; i<=10; i++){
			try{
				Thread.sleep(3000);
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String []args){
		Fact fa = new Fact();
		fa.start();
	}
}
