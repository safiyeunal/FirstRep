package com.syntax.class10;

public class MoreArray {

	public static void main(String[] args) {
		
		char[] grade = {'A','B','C','D','E','F','G','H'};
		char sendValue=grade[1];
		
		String[] names= {"Mike","Burju","Jack","Danilo","Bryan","Evgenia"};
		String secondVal=names[1];
		
		//get all values from grade array
		for (int i=0; i<grade.length; i++) {
			
			char valuesFromArray=grade[i];
			System.out.println(valuesFromArray);
		}
		
		
		
		
		
	}

}
