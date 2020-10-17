package com.syntax.class04;

import java.util.Scanner;

public class replit {

	public static void main(String[] args) {
		
		 Scanner input=new Scanner(System.in);
		  System.out.println("Please enter 3 distinct numbers");
		  int a=input.nextInt();
		  int b=input.nextInt();
		  int c=input.nextInt();
		  
		  if (a>b) {
		    if(a>c) {
		      System.out.println("The largest number is " + a);
		    }else  {
		      System.out.println("The largest number is " + c);
		    }
		  }else  {
			  if (b>c) {
		    System.out.println("The largest number is " + b);
		  } else {
		    System.out.println("The largest number is " + c);
		    }
		  }
		  
		  
		  
		  }

	}


