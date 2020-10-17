package com.syntax.class05;

import java.util.Scanner;

public class WeekdayEnd {

	public static void main(String[] args) {
		/*Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”, 
		 * anyday from 6-7 → output “It is a weekend”, 
		 * any other day → output “Invalid day”
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is the day?");
		int number=input.nextInt();
		
		if (number == 1 || number == 2 || number== 3 || number==4 || number==5) {
			System.out.println("It is a weekday");
		}else if (number==6 || number== 7) {
			System.out.println("It is a weeekend");
		}else {
			System.out.println("Invalid day");
		}
	}

}
