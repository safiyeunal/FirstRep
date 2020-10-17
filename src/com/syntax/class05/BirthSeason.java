package com.syntax.class05;

import java.util.Scanner;

public class BirthSeason {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. 
		 * Based on the month define the season.
		 * Example: if user is born in June, July or August → season =”Summer”.
		 * At the end of the program we should see output as “You were born ______”.
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your birth month");
		String month=input.next();
		String season ;
		
		
		if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February" )|| month.equalsIgnoreCase("December")) {
			season= "Winter";	
		}else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			season= "Spring";
		}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			season= "Summer";
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			season= "Fall";
		}else {
			season="invalid";
		}
		System.out.println("You were born in " + season);
	}

}
