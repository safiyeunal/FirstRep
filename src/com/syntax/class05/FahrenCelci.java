package com.syntax.class05;

import java.util.Scanner;

public class FahrenCelci {

	public static void main(String[] args) {
			
		Scanner input=new Scanner(System.in);
		
		System.out.println("Which city are you living?");
		String city=input.nextLine();
		System.out.println("What is the temperature in Fahrenheit?");
		int temp=input.nextInt();
		
		double newtemp=(temp - 32)/(1.8);
		
		System.out.println("The temperature is " + newtemp + " in " + city);
		

	}

}
