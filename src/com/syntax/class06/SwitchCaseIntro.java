package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a day number");
		int day = scan.nextInt();
		String myDay;

		if(day==1) {
			myDay="Mon";
		}
		else if(day==2) {
			myDay="Tue";
		}
		else if(day==3) {
			myDay="Wed";
		}
		else if(day==4) {
			myDay="Thu";
		}
		else if(day==5) {
			myDay="Fri";
		}
		else if(day==6) {
			myDay="Sat";
		}
		else if(day==7) {
			myDay="Sun";
		}	
		else {
			myDay="Invalid day";	
		}
		
		System.out.println("Today is " + myDay);
		
		System.out.println("----------------------SAME EXAMPLE USING SWITCH CASE-------------------");
		String today;
		
		switch(day) { //data type of the variable must match with data type of cases
		case 1:
			today="Monday";
			break;
		case 2:
			today="Tuesday";
			break;
		case 3:
			today="Wednesday";
			break;
		case 4:
			today="Thursday";
			break;
		case 5:
			today="Friday";
			break;
		case 6:
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;
		default:
			today="Invalid day";
			break; // break is optional since it is last statement in the switch block
			
		
	}
		System.out.println("Today is " + today);
	}
}
