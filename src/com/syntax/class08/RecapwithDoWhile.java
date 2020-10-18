package com.syntax.class08;

import java.util.Scanner;

public class RecapwithDoWhile {

	public static void main(String[] args) {
		
		
		Scanner input;
		int money;
		int waterPrice=5;
		
		input=new Scanner(System.in);
		System.out.println("Please pay for your water!");
		//money=input.nextInt();
		
		do {
			money=input.nextInt();
			if(money<waterPrice) {
				System.out.println("Please give more");
				
			}else if (money>waterPrice) {
				System.out.println("Please give less");
				
			}
			//money=input.nextInt();
					
		}while (money!=waterPrice); {
			System.out.println("Enjoy your water");
		}

	}

}
