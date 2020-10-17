package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseTask {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: 
		 * A-Excellent, 
		 * B-Good, 
		 * C-Average, 
		 * D-Bad, 
		 * any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner scan=new Scanner(System.in);
		String grade;
		String result;
		
		System.out.println("Please enter your grade");
		grade=scan.next();
		
		switch(grade) {
			
		case "A":
			result="Excellent";
			break;
		case "B":
			result="Good";
			break;
		case "C":
			result="Average";
			break;
		case "D":
			result="Bad";
			break;
		default:
			result="Not acceptable";
		}
		
		System.out.println(result);
	}

}
