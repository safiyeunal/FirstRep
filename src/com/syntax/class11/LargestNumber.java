package com.syntax.class11;

public class LargestNumber {

	public static void main(String[] args) {
		
		//I would like to find largest number from the array?
		
		int [] array = {10,0,20,8,-1,77,56,};
		int maxNum = -100 ;
		
		for (int x=0; x<array.length; x++) {
			if (array[x]>maxNum) {
				maxNum=array[x];
			}else {
				continue;
			}
			
		}
		System.out.println(maxNum);
	
		
		

	}

}
