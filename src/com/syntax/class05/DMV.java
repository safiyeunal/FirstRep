package com.syntax.class05;

import java.util.Scanner;

public class DMV {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age=scan.nextInt();
		
		if (age>=18) {
			System.out.println("I can issue a DL");
		}else {
			System.out.println("I can issue learners permit");
		}

	}

}
