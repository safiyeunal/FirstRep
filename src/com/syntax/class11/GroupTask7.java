package com.syntax.class11;

public class GroupTask7 {

	public static void main(String[] args) {
		// GroupTask7
		/*
		 * Create a 2D array to store numbers in 3 rows and 4 columns. 
		 * Develop a program which will identify/print the even numbers only.
		 */
				int[][] array = { 
						{ 1, 2, 11, 14 }, 
						{ 18, 12, 3, 25 }, 
						{ 5, 8, 7, 19 } 
						};
				
				for (int i = 0; i < array.length; i++) {
					
					for (int a = 0; a < array[i].length; a++) {
						
						if (array[i][a] % 2 == 0) {
							
							System.out.println(array[i][a]);
						}
					}
				}

	}

}
