package com.corejava.chaptr4;

public class LogicalOperator {
	public static void main(String[] args) {

		// &&  AND operator
		//true only if both expression1 and expression2 are true
		System.out.println((5 > 3) && (8 > 5));  // true
		System.out.println((5 > 3) && (8 < 5));  // false

		// ||  OR operator
		//true if either expression1 or expression2 is true
		System.out.println((5 < 3) || (8 > 5));  // true
		System.out.println((5 > 3) || (8 < 5));  // true
		System.out.println((5 < 3) || (8 < 5));  // false

		// !  NOT operator
		// true if expression is false and vice versa
		System.out.println(!(5 == 3));  // true
		System.out.println(!(5 > 3));  // false
	}

}
