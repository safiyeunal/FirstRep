package com.syntax.class08;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money accumulate the amount 
		 * and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. 
		 * Whenever a user done with payments program should say “Thank you for shopping!”
		 */

		Scanner scan=new Scanner(System.in);
		int money = 0;
		int remain = 0;
		int totalmoney = 0;
		
		System.out.println("What is the item you want to buy?");
		String item=scan.nextLine();
		
		System.out.println("How much is the item?");
		int price=scan.nextInt();
		totalmoney=money+remain;
		
		System.out.println("Enter the money you have");
		money=scan.nextInt();
			
		while (price!=totalmoney) {
			totalmoney+=money;
			if(price>totalmoney) {
				System.out.println("The amount remaining " + (price-totalmoney));
				remain=price-money;
				System.out.println("Enter the money you have");
				money=scan.nextInt();
			}else if (price<totalmoney) {
				System.out.println("Your change is " + (totalmoney-price));
				break;
			}	
		}
		System.out.println("Have a good day");	
	}

}
