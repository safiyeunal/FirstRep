package com.syntax.class11;

public class GroupTask6 {

	public static void main(String[] args) {
		
		double [][] array= {
				{39.0, 78.0, 3.5},
				{10.0 , 57.5 , 80.0},
				{61.5, 33.5 , 90}};
		
		// /assign random values to the 2D array:
		double sum=0;
		for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			sum+=array[i][j]; // summing the arrays with a loop
			System.out.print(array[i][j]+ " | ");
			
		}
	}
	System.out.println("\nThe sum of all values on the 2D array is: " + sum);
		// now the values are assigned. We can sum all the elements on the
		}

	}


