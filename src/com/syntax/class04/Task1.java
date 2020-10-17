package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpa=3.5;
		
		if (diploma=true) {
			System.out.println("Congratulations");
			if (gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			
			}
		}else  {
			System.out.println("get a degree");
		}
		
		System.out.println("-------------------------------");
		
		double rate=3;
		long price=250000;
		
		if (rate<4.5) {
			System.out.println("User will consider buying house");
			if (price>200000) {
				System.out.println("Take a loan");
			}else {
				System.out.println("Pay cash"); 
			}
		}else {
			System.out.println("User will not buy house");
			
			}
		}
	}

