package com.syntax.class05;

import java.util.Scanner;

public class DoubleComp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double num1,num2;
		System.out.println("Print 2 double value");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		
		if (num1>num2) {
			System.out.println(num1 + " is larger than " + num2);
		}else {
			System.out.println(num2 + " is larger than " + num1);
		}

	}

}
