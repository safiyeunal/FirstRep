package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day="Sunday";
		
		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today I have a Java class at Syntax");
		}
		System.out.println("The end");
		
		System.out.println("---------------- more examples ------------");
		/*
		 * if day is 1 or 5 --> off
		 * if day 2 or 3 --> GIT class
		 * if day is 4--> review
		 * if day 6 or 7 --> java
		 * everything else will be invalid day
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter todays day using numbers only");
		
		int today=scan.nextInt();
		
		if (today==1 || today==5) {
			System.out.println("I am off from Syntax");
		}else if (today==2 || today==3) {
			System.out.println("Today is GIT class");
		}else if (today==4) {
			System.out.println("Today is review class");
		}else if (today==6 || today==7) {
			System.out.println("Today is java class");
		}else {
			System.out.println("invalid day");
		}
		
		
	}

}
