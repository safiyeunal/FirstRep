package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * variable for allergy yes or no
		 * 
		 * if allergy is yes -->
		 * 
		 * we will check if pet allergy
		 * peanut allergy
		 * if pollen allergy
		 * 
		 * if no allergy you are lucky !!
		 */
		
		boolean allergy = true;
		
		boolean petAllergy=true;
		boolean peanutAllergy=true;
		boolean pollenAllergy=true;
		
		if (allergy) {
			System.out.println("Lets do further check");
			
			if (petAllergy) {
				System.out.println("Please no cats and dogs in the house");
			}else {
				System.out.println("That is good you do not have pet allergy");
			}
			
		}else {
			System.out.println("You are lucky");
		}
		
		System.out.println("------------------------------------------");
		
		/*
		 * if today is friday we will watch movie but would like to check the date
		 * 
		 * if date is 13 --> watch scary movie
		 * and if it is not --> I will watch comedy; action
		 * 
		 * if not friday --> I am studying
		 */
		
		boolean isFriday=true;
		int date=13;
		boolean monday=true;
		
		if (isFriday) {
			
			if(date==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch PK movie with Amir Khan");
			}
			
			
		}else {
			if (monday) {
				System.out.println("I am not studying, I am working");
			}else {
				System.out.println("I have class");
			}
			}
		
		System.out.println("------------------------------------------");
		
		/*
		 * check if assignment is completed
		 * if assignment is completed:
		 * 				if score>90 --> great job
		 *				if score>80 --> good job
		 *				if score>70 --> prease study more
		 */
		
		int score=80;
		boolean assignment=true;
		
		if (assignment=true) {
			System.out.println("You completed the assignment");
			if (score>90) {
			System.out.println("Great job");
			}else if (score>80) {
			System.out.println("Good job");
			}else if (score>70) {
			System.out.println("Study more");
			}else {
				System.out.println("Thank you for trying");
		
			}
			
		}else {
			System.out.println("You should complete");
			}
		}
		
		
	}


