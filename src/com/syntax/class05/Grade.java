package com.syntax.class05;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and 
		 * determine the grade based on the following rules: 
		 * if the average score >=90 → grade=A
		 * if the average score >= 70 and <90 → grade=B
		 * if the average score>=50 and <70 → grade=C
		 * if the average score<50 → grade=F
		 */
		
		Scanner input=new Scanner(System.in);
		
		int q, m, f;
		
		System.out.println("What is your quiz score?");
		q=input.nextInt();
		System.out.println("What is your mid term score?");
		m=input.nextInt();
		System.out.println("What is your final score?");
		f=input.nextInt();
		
		int avr = ((q+m+f)/3);
		char grade;
		
		if (avr>=90) {
			grade='A';
		}else if (avr>=70 && avr<90) {
			grade='B';
		}else if (avr>=50 && avr<70) {
			grade='C';
		}else if (avr<50 && avr>=40) {
			grade='D';
		}else {
			grade='F';
		}
		 
		System.out.println("Grade is = " + grade);
		
		if(grade=='A' || grade=='B') {
			System.out.println("You are good student");
		}else {
			System.out.println("Please study more");
		}
		
	}

}
