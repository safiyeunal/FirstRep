package com.syntax.class11;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		char [][] $array=new char [3][4];
		
		//add values to 1st row
		$array[0][0]='A';
		$array[0][1]='B';
		$array[0][2]='C';
		$array[0][3]='D';
		
		//2nd row
		$array[1][0]='W';
		$array[1][1]='X';
		$array[1][2]='Y';
		$array[1][3]='Z';
		
		//3rd row
		$array[2][0]='Q';
		$array[2][1]='W';
		$array[2][2]='B';
		$array[2][3]='R';
		
		System.out.println($array[1][3]); //print Z
		
		System.out.println($array.length); // 3. how many rows or small arrays inside a big array
		
		for (int row=0; row<$array.length; row++) { //loops through rows
			
			for (int col=0; col<$array[row].length; col++ ) {
				System.out.print($array[row][col] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("-----------Another way to create a 2D array---------------");
		
		int[][] array= {
				
				{10,20,30},
				{1,2,3},
				{100,200,300}
				
		};
		
		System.out.println(array[2][1]);  //200
		System.out.println(array[0][0]); //10
		System.out.println(array.length); //inside big array how many small arrays?
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		}

	}


