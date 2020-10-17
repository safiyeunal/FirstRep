package com.syntax.class07;

public class Recap {

	public static void main(String[] args) {
		
		
		String month="March";
		
		//if month is december - february ------> winter
		
		
		switch (month) {
		case "January" :
		case "February":
		case "December":
			System.out.println("Winter");
			break;
		case "March":
		case "April":
		case "May":
			System.out.println("Spring");
			break;
		case "June":
		case "July":
		case "August":
			System.out.println("Summer");
			break;
		case "September":
		case "October":
		case "November":
			System.out.println("Fall");
			break;
		}
	}

}
