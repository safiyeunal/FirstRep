package com.syntax.class06;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		/*
		 * 
		 * Write a program to find largest number among three numbers 
		 * using nested if provided by a user (numbers must be distinct)
		 * 
		 */
		
		Scanner input=new Scanner(System.in);
		double a,b,c;
		System.out.println("Please type 3 double number");
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		
		if (a>b) {
			if (a>c) {
				System.out.println(a + " is the biggest number");
			}else {
				System.out.println(c + " is the biggest number");
			}
			
		}else {
			if(b>c) {
				System.out.println(b + " is the biggest number");
			}else {
				System.out.println(c + " is the biggest number");
			}
		}
		
		
		/*Second way	
		 * 
		 * 
		 * double biggest;
		
		if (a>b) {
			if(a>c) {
				biggest=a;
			}else {
				biggest=c;
			}
		}else {
			if (b>c) {
				biggest=b;
			}else {
				biggest=c;
			}
		}
		
		System.out.println(biggest + " is the largest");
		 * 
		 */
		
		
		
		
	}

}
