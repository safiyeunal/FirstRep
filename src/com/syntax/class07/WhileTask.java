package com.syntax.class07;

public class WhileTask {

	public static void main(String[] args) {
		
		boolean workDay=true;
		int day=1;
		
//		if (workDay) {
//			System.out.println("I need a day off");
//		}
//			
//		while (day<6) {
//			System.out.println("day= "+day);
//			System.out.println("I need a day off");
//			System.out.println("I do not need a day off any more");
//			day++;
//			}
		
		while (workDay) {
			if (day<6) {
				System.out.println("I need a day off");
			}else {
				System.out.println("It is weekend and I am off");
				break;
			}
			day++;
		}
		
		
		
		

	}

}
