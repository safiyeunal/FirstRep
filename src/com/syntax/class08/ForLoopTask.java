package com.syntax.class08;

import java.util.Scanner;

public class ForLoopTask {

	public static void main(String[] args) {
		/*
		 * 1. Print numbers from 1 to 100 in 1 line with space
		 * 2. Print numbers from 100 to 1
		 * 3. Print even numbers from 20 to 1 (2 ways)
		 * 4. Print odd numbers between 20 and 50 (2 ways)
		 */

		// 1. Task
		
		for (int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
		
		//2. Task
		
		System.out.println("");
		for (int a=100; a>=1; a--) {
			System.out.print(a + " ");
		}
		
		//3. Task 1. Way
		
		System.out.println("");
		for (int b=20; b>1; b-=2) {
			System.out.print(b + " ");
		}
		
		//3. Task 2. Way
		
		System.out.println("");
		for (int c=20; c>1; c--) {
			if (c%2==0) {
				System.out.print(c + " ");
			}
		}
		
		//4. Task 1. way
		
		System.out.println("");
		
		for (int j=21; j<=50; j+=2) {	
			System.out.print(j + " ");
	}
		
		//4. task 2. way
		System.out.println("");
		for (int k=20; k<=50; k++) {
			if (k%2!=0) {
				System.out.print(k + " ");
			}
		}
		
		//
		System.out.println("");
		int sum=0;
		
		for (int h=1; h<6; h++) {
			sum=sum+h;
			
			System.out.print(sum + " ");
		}
		System.out.println("");
		int s;
		for (s=1; s<6; s++) {
			System.out.println("Value for s inside the loop " + s);
		}
		System.out.println("Value for s outside the loop " + s);
		
		System.out.println("--------------------------------------------");
		
		int result=0;
		
		for (int r=10; r>=1; r--) {
			result*=r;
		}
		System.out.println(result);
		
		System.out.println("--------------------------------------------");
		
		int results=1;
		
		for (int y=10; y>=1; y-=2) {
			results*=y;
			System.out.println(results);
		}
		System.out.println("--------------------------------------------");
		
		
		System.out.println("--------------------------------------------");
		//I wan to create a multiplication table
		/*
		 * 1*1=1
		 * 1*2=2
		 * 1*3=3
		 * 
		 * 1*10=10
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter which number");
		int num1=scan.nextInt();
		int mult;
		
		for (int i=1; i<=10; i++) {
			
			mult=num1*i;
			
			System.out.println(num1 + " x " + i + " = " + mult);
		}
		
		
		
		
		
		
		
	}

}














