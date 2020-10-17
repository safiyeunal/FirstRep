package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not.
		 * If your user does not have a credit card then offer them.
		 * If they do have one ask what is balance on the card?
		 * If balance of the card is larger than 1000,
		 * tell them to pay off immediately, otherwise you can tell them that they can spend more.
		 */
		
		Scanner scan;
		String answer;
		double balance;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter if you have a credit card (true/false)");
		answer=scan.next();
		
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance?");
			balance=scan.nextDouble();
			if (balance>1000) {
				System.out.println("You need to pay");
			}else {
				System.out.println("You can spend more");
			}
			
		}else {
			System.out.println("Get a credit card");
		}
		

	}

}
