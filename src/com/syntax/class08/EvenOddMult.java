package com.syntax.class08;

import java.util.Scanner;

public class EvenOddMult {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints the sum of the even and odd integers.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a range of integers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		
		for(int c = a; c<=b; c++) {
			if (c%2==0) {
			evenSum+=c;
		}else {
			oddSum+=c;
		}
			
		}
		System.out.println("The sum of even numbers is " + evenSum);
		System.out.println("The sum of odd numbers is " + oddSum);
	}

}
