package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		//I want to print number from 1 to 5 except number 3
		
		for (int i=1; i<=5; i++) {
			
			if (i==3) {
				continue;
				
			}
			
		System.out.println(i);
		}
		System.out.println("End of the loop");
	}

}
