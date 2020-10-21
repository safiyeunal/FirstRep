package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {
		
		/*
		 *  ******
		 *  ******
		 *  ******
		 *  ******
		 */
		
		for (int i=1; i<=4; i++) {
		   
			for (int j=1; j<=6; j++) {
			System.out.print("*");
			}
			 System.out.println();
		}
		System.out.println("------------------");
		
		/*  ************
		 	************
		 	************
		 	************
		 	************
		 	************
		 */
		
		for (int i=1; i<=6; i++) {
			
			   
			for (int j=1; j<=12; j++) {
			System.out.print("*");
			}
			 System.out.println();
		}
		
		System.out.println("------------------");
		/*  12345
			12345
			12345
			12345 
		 */
		 for (int r=1; r<=4; r++) {
			 
			 for (int c=1; c<=5; c++) {
				 System.out.print(c);
			 }
			 System.out.println();
		 }
		 System.out.println("------------------");
		 /* 12345678
			12345678
			12345678
			12345678
			12345678
			12345678
			12345678
		  */
		 for (int r=1; r<=7; r++) {
			 
			 for (int c=1; c<=8; c++) {
				 System.out.print(c);
			 }
			 System.out.println();
		 }
		 
		 System.out.println("------------------");
		 /* 7777777
			6666666
			5555555
			4444444
			3333333
			2222222
			1111111
		  */
		 for (int m=7; m>=1; m--) {
			 
			 for (int n=1; n<=7; n++) {
				 System.out.print(m);
			 }
			 System.out.println();
		 }
		 System.out.println("------------------");
		 
		 /* 7654321
		  * 7654321
		  * 7654321
		  * 7654321
		  * 7654321
		  */
		 
		 for (int m=5; m>=1; m--) {
			 
			 for (int n=7; n>=1; n--) {
				 System.out.print(n);
			 }
			 System.out.println();
		 } 
		 
	}

}
