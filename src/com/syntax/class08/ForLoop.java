package com.syntax.class08;

public class ForLoop {

	public static void main(String[] args) {
		
		//say Good Morning 5 times
		
		/*
		 * FOR SYNTAX
		 * 
		 * FOR (initialization; condition: increment/decrement) {
		 * 		code;
		 * }
		 */
		
		for (int i=1; i<=5; i++) {
			System.out.println("Good morning");
		}
		
		//print numbers 1 to 100
		/*
		 * FOR SYNTAX
		 * 
		 * for (start point; end point; increment/decrement) {
		 * 		code;
		 */
		
		for (int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		System.out.println("---- I want to print number 10 to 0 ----");
		
		for (int i=10; i>=10; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("---------------- What will be the output -----------------");
		
		for (int i=0; i<=30; i+=3) {
			System.out.println(i + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
