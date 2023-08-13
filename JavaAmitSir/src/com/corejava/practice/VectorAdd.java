package com.corejava.practice;

import java.util.Vector;

public class VectorAdd {
	public static void main(String args[]) {
		Vector<String> vc = new Vector<>();
		System.out.println(vc.capacity());

		vc.add("RAM");
		vc.add("RAJESH");
		vc.add("SITA");
		vc.add("ANITA");
		System.out.println(vc);

		vc.addElement("BABY");
		System.out.println(vc);
		System.out.println(vc.size());

	}

}
