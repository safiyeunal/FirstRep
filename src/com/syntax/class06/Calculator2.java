package com.syntax.class06;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		char operation;
		int results = 0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println("Please enter the operation + - / *");
		operation=scan.next().charAt(0);
		
		switch (operation) {
		case '+' :
			results = (num1 + num2);
			break;
		case '-':
			results = (num1 - num2);
			break;
		case '/':
			results = (num1/num2);
		case '*':
			results = (num1*num2);
			break;
		default:
			System.out.println("Invalid operation");
		}
	//	if (results != 0) {
		System.out.println(results);
	//	}
	}

}
