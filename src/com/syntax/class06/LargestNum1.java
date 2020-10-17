package com.syntax.class06;

import java.util.Scanner;

public class LargestNum1 {

	public static void main(String[] args) {
		/* Write a program to find largest of three double values using if-else..
		 * if and logical operators provided by a user (numbers must be distinct)
		 */
		
		Scanner input=new Scanner(System.in);
		double a,b,c;
		double max;
		System.out.println("Please type 3 double number");
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		input.close();
		
		if (a>b && a>c) {
			max=a;
		}else if (b>c) {
			max=b;
		}else {
			max=c;
		}
		
		System.out.println(max + " is the largest");
		
		System.out.println("------------------------------------------");	
		
		
	}

}
