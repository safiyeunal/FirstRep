package com.syntax.class12;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		// find the second largest number in an array
		
		int [] num1 = {964,45,965,65,965,32,876,900,900} ;
		int length=num1.length;
		Arrays.sort(num1); //{1,3,5,6,10} from lowest to largest
		System.out.println("Second highest number is " + num1[length-2]);

		//find the second largest number in an array without sort function
		
		int[] myArray= {1166,45,965,65,965,32,876,900};
		int max=myArray[0];
		int secoundmax=0;
	
		for(int i=0;i<myArray.length;i++) {
			if(myArray[i]>max) {
				secoundmax=max;
				max=myArray[i];
			}
			else if(myArray[i]>secoundmax && myArray[i]!=max){
				secoundmax=myArray[i];
				
				}
			
			}
		
		System.out.println("the largest number in array is :"+max);
		System.out.println("the 2nd largest number is :"+secoundmax);
		
		
	}

}
