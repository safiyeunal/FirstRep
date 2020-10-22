package com.syntax.class10;

public class ArrayTasks {

	public static void main(String[] args) {
		/*Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */

		char[] anArray= new char[6];
		anArray[0]='A';
		anArray[1]='B';
		anArray[2]='C';
		anArray[3]='D';
		anArray[4]='E';
		anArray[5]='F';
		
		System.out.println(anArray[1]);
		
		char[] array = {'A','B','C','D','E','F'};
		
		System.out.println(array[1]);
		
		
		/*Create an array of names and store all names of your group. 
		 * Then print your name from that array. 
		 * (use 2 different ways of creating an array)
		 */
		
		String[] names=new String[4];
		names[0]="Selma";
		names[1]="Mehmet";
		names[2]="Salih";
		names[3]="Safiye";
		
		System.out.println(names[3]);
		
		String [] name= {"Selma","Mehmet","Salih","Safiye"};
		
		System.out.println(name[3]);
		
		/*
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: 
		 * “Saturday is Java coding Day”
		 */
		
		String[] word= {"Java","Saturday","Day","coding","is"};
		
		System.out.println(word[1]+ " " + word[4] + " " + word[0] + " " + word[3] + " " + word[2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
