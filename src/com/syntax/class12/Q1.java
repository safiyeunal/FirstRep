package com.syntax.class12;

public class Q1 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable? 
		// Swap  2 strings without a temporary variable?
		
		int x = 10;
		int y = 20;
		
		x = y+x;
		y=x-y;
		x=x-y;
		
		System.out.println(x);
		System.out.println(y);

	}

}
