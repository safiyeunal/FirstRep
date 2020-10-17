package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in); //input u can name it any name the rest memorize
		
		System.out.println("Please enter boolean value for rain");
		
		boolean rain=input.nextBoolean();
		
		if(rain) {
			System.out.println("take umbrella");
		
		}else {
			System.out.println("nice weather");
		}

		
		System.out.println("----------------------------------------------");
		
		System.out.println("Please enter your name");
		String name=input.next();

		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		System.out.println("Your name is " + name + " you are " + age + " years old");
	}


}
