package com.syntax.class11;

public class GroupTask2 {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not?
		 * 
		 * Logic behind it: Prime number is a number which can not divided except 1 and the number itself. 
		 * We search for any number that can divide it, if no it’s prime, if yes not prime.
		 * we can search while (i<num/2) as short way, because the searching half of it is enough. 
		 * Also we take int =2 first because we search for a number except 1
		 */
		
		int num=31; 
		int i=2;
		boolean ifPrime=false;
		 
		while (i<num) {
			if (num%i==0) {
				ifPrime=false;
				break;				
			}else {
				ifPrime=true;	
			}
			i++;
		}
		
		if (ifPrime==true) {
			System.out.println("The number "+num+ " is a prime number");
		}else {
			System.out.println("The number "+num+ " is not prime number");
		}

	}

}
