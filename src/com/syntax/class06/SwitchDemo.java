package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/*
		 * lets ask a tester on witch browser they would like to use
		 */
		
		Scanner scan=new Scanner(System.in);
		String browser;
		String message;
		
		System.out.println("Please enter a browser");
		browser=scan.nextLine();
		
		switch(browser.toLowerCase()) {
		
		case "safari":  //data type of switch must match with case. string-->string
			message="Your code will be execudet on Safari browser";
			break;
		case "chrome": 
			message="Your code will be execudet on Chrome browser";
			break;
		case "firefox" : 
			message="Your code will be execudet on Firefox browser";
			break;
		default:
			message="Not supported";
		}
		  
		//we can not use relational and logical operators in switch case
		//we need to know expected result
		//only work with byte, short, char, int and string
		//cannot work with double,float and long
		
		System.out.println(message);
		
		}

}
		
		
		
		
	


