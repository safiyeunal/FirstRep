package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time = 15;
		
		if (time >12) { //condition is true
			System.out.println("good day"); //code executes 1 time
		}
		
		System.out.println("---------------------WHILE LOOP---------------------");
		
//		while (time > 12) {
//			System.out.println("good day"); //infinite loop
//	}	
			
		while (time > 12) {
			System.out.println("good day"); // prints 3 time
			time--;
		}
//		while (time > 12) {
//			System.out.println("good day"); //infinite loop
//			time++;
//		}
//want to print numbers from 1 to 50
		System.out.println("PRINTING NUMBERS 1 TO 50-----------------------");
		int num=1;
		while(num<=50) {  //or (num<51)
			System.out.print(num + " ");
			num++;
		}
		System.out.println();
// want to print numbers from 10 to 60
		System.out.println("PRINTING NUMBERS 1 TO 60-----------------------");	
		
		int a=10;
		
		while(a<61) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
// I want to print numbers from 100 to 60
		System.out.println("PRINTING NUMBERS 100 TO 60------------------");		
			
		int b=100;
		
		while(b>=60) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println();
//I want to print numbers from 10 to 30 only even numbers
		System.out.println("PRINTING NUMBERS 10 TO 30 only even------------------");
			
			int c=10;
			
			while(c<31 ) {
				
				if (c%2==0) {
					System.out.print(c+ " ");
					//c++; --> if we keep increment here we will get infinite loop
				}
				c++;
				
			}
			System.out.println();
			System.out.println("---Another way---");
			
			int d=10;
			
			while (d<=30) {
				System.out.print(d+ " ");
				d+=2;
			}
			System.out.println();
// print numbers from 100 to 1 odd numbers only
			System.out.println("100 to 1 odd numbers");
			int e=100;
			
			while (e > 0) {
				
				if ((e%2)!=0) {
				System.out.print(e + " ");
				}
				e--;
			}
			System.out.println();
			System.out.println("---Another way---");
			
			int f = 99;
			
			while (f>0) {
				System.out.print(f+ " ");
				f-=2;
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}


