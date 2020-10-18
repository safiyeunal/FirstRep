package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// play a lottery where we need to enter number from 1 to 100
		//lucky number is 7
		//keep asking user to enter a number until entered number is lucky number
		
		Scanner scan;
		int numberFromUser;
		
		int LuckyNumber=7;
		
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from range 1 to 100");
			numberFromUser=scan.nextInt();
			
		} while (numberFromUser!=LuckyNumber);
		
			System.out.println("You guess the number right!");
			
			
			
			
			
	}

}
