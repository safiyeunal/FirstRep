package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a 2D array where you will store the following values: 
		 * Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		 * After storing values print the following:
		 * Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
		
		String [][] array =new String [4][4];
		
		array[0][0]="Mr";
		array[0][1]="Mrs";
		array[0][2]="Ms";
		array[0][3]="Miss";
		
		array[1][0]="Smith";
		array[1][1]="Obama";
		array[1][2]="Jackson";
		array[1][3]="Jordan";
		
		
	System.out.println(array[0][0] + " " + array[1][0]);
	System.out.println(array[0][1] + " " + array[1][1]);
	System.out.println(array[0][2] + " " + array[1][2]);
	System.out.println(array[0][3] + " " + array[1][3]);
		
		
		

	}

}
