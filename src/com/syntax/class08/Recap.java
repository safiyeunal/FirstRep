package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
// ask user to pay for a water
//water price is 5 dollars
//once user enters money then we need to tell if we need more money or less
//once user giver us exact 5 then-->enjoy your water
		
		Scanner input;
		int money;
		int waterPrice=5;
		
		input=new Scanner(System.in);
		System.out.println("Please pay for your water!");
		money=input.nextInt();
		
		while(money!=waterPrice) {
			if(money<waterPrice) {
				System.out.println("Please give more");
				//money=input.nextInt();
			}else  {
				System.out.println("Please give less");
				//money=input.nextInt();
			}
			money=input.nextInt();
		}
		System.out.println("Enjoy your water");
	}

}
