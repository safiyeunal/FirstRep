package com.syntax.class06;

import java.util.Scanner;

public class xx {

	public static void main(String[] args) {

    
    Scanner scan=new Scanner(System.in);
    System.out.println("Please enter your mark");
    int mark=scan.nextInt();
    String grade= "";
    
    if (mark>=1 && mark<=25) {
      grade="F";
      System.out.println("Your grade is " + grade);
    }else if (mark>25 && mark<=45) {
      grade="E";
      System.out.println("Your grade is " + grade);
    }else if (mark>45 && mark<=50) {
      grade="D";
      System.out.println("Your grade is " + grade);
    }else if (mark>50 && mark<=60) {
      grade="C";
      System.out.println("Your grade is " + grade);
    }else if (mark>60 && mark<=80) {
      grade="B";
      System.out.println("Your grade is " + grade);
    }else if (mark>80 && mark>=100) {
      grade="A";
      System.out.println("Your grade is " + grade);
    }else {
      System.out.println("Please enter valid mark");
    }
 
    //2. yol
    /* Scanner scan;
	int mark;
	char grade = 0;

	scan = new Scanner(System.in);
	System.out.println("Please enter your mark");
	mark = scan.nextInt();
	if (mark > 0 && mark < 25) {
		grade = 'F';
	} else if (mark >= 25 && mark < 45) {
		grade = 'E';
	} else if (mark >= 45 && mark < 50) {
		grade = 'D';
	} else if (mark >= 50 && mark < 60) {
		grade = 'C';
	} else if (mark >= 60 && mark < 80) {
		grade = 'B';
	} else if (mark >= 80 && mark <= 100) {
		grade = 'A';
	} else {
		System.out.println("Please enter valid mark");
	
	if (grade!=0){
	  System.out.println("Your grade is "+grade);
	}   
     * 
     */
    
    
   
    
    
  }}
