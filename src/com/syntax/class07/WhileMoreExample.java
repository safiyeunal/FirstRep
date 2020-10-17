package com.syntax.class07;

public class WhileMoreExample {

	public static void main(String[] args) {
		
		String day= "Saturday";
		
		if (day.equals("Saturday")) {
			System.out.println("My favorite Java class");
		}
		
		while(day.equals("Saturday")) {
			System.out.println("My favorite Java class");
		}
		
System.out.println("----------------------------------------");
		boolean isItBreakTime=true;
		
		if(isItBreakTime) {
			System.out.println("I will get tea");
		}
		while (isItBreakTime) {
			System.out.println("I will get tea");
			isItBreakTime=false;
		}
		
	}

}
