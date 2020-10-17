package com.syntax.class05;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How much loan you need?");
		int loan=scan.nextInt();
		
		if (loan<=200000) {
			System.out.println("I can loan the money");
		}else {
			System.out.println("Sorry can not loan the money");
		}
		

	}

}
