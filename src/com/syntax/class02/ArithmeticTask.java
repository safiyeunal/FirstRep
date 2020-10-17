package com.syntax.class02;

public class ArithmeticTask {

	public static void main(String[] args) {
		/*Write a Java program to add, subtract, multiply and divide 2 decimal values. 
* Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
* Write a program to find the square of the number 3.9. 
* You program should say “The square of the ____ is ____ 
* Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
* Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
*/
	//Task1	
	int num1, num2;
	
	num1=20;
	num2=10;
	
	System.out.println("The addition of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1+num2));
	System.out.println("The subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1-num2));
	System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1*num2));
	System.out.println("The divition of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1/num2));
	
	//Task2
	double num3=3.9;
	
	System.out.println("The square of " + num3 + " is " + (num3*num3));
	
	//Task3
	int width, height, perimeter, area;
	
	width=5;
	height=8;
	perimeter=2*(width+height);
	area=width*height;
	
	System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + perimeter + " and the area is " + area);
	
	
	}

}
