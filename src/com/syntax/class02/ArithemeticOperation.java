package com.syntax.class02;

public class ArithemeticOperation {

	public static void main(String[] args) {
		
		//Arithmetic Operations: +, -, *, /, %
		int num1, num2;
		
		num1=10;
		num2=12;
		
		System.out.println(num1+num2);
		System.out.println(num2-num1);
		
		double num3=10.99;
		double num4=2.99;
		
		double mult=num3*num4;
		System.out.println(mult);
		
		double div=num3/num4;
		System.out.println(div); //3.6755852842809364
		
		
		float f=10.99f;
		float f1=2.99f;
		
		System.out.println(f/f1); //3.6755853
		
		System.out.println("The result of division equals to " + f/f1);
	}

}
