package com.syntax.class08;

public class EvenOddMultiTask {

	public static void main(String[] args) {
		//Calculate sum of even and odd numbers from range 1 to 50
		
				int evenSum=0;
				int oddSum=0;
				
				//1. way 
				
			//	for(int z=0; z<=50; z+=2) {
			//		evenSum+=z;
			//	}
				//System.out.println("The sum of all even number from 1 to 50 is " + evenSum);
				
				
				//2. way for both
				
				for (int z=1; z<51; z++) {
					if (z%2 == 0) {
						evenSum+=z;
					}else {
						oddSum+= z;
					}
				}
				
				System.out.println("The sum of all even number from 1 to 50 is " + evenSum);
				
				System.out.println("The sum of all odd number from 1 to 50 is " +oddSum);

	}

}
