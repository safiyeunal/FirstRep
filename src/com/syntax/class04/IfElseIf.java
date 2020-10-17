package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
 	/* 
		* we need to compare 2 numbers:
		* bigger, smaller or equal
		*/
		
		int num1=19;
		int num2=99;
		
		if(num1>num2) { //what if this condition is true
			System.out.println(num1+ " ir bigger than " + num2);
		}
		else if (num1<num2) { //or what if this condition is true
			System.out.println(num1 + " is smaller than " + num2);
		}
		else {
			System.out.println(num1 + " is equal to " + num2);
		
		}
		
		System.out.println("--------------------------------------------");
		
		/* based on the day of the week we will print clas schedule
		 * 
		 */
		
		int day=7;
		
		if(day==1) {
			System.out.println("Today is Monday we have no class");
		}
		else if(day==2) {
			System.out.println("Today is Tuesday we have manual class");
		}
		else if(day==3) {
			System.out.println("Today is Wednesday we have manual class");
		}
		else if(day==4) {
			System.out.println("Today is Thursday we have review class");
		}
		else if(day==5) {
			System.out.println("Today is Friday we have no class");
		}
		else if(day==6) {
			System.out.println("Today is Saturday we have java class");
		}
		else if(day==7) {
			System.out.println("Today is Sunday we have java class");
		}	
		else {
			System.out.println("Tis id invalid day of a week");		
		}
	}
}
