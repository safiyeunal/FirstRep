package com.syntax.class05;

import java.util.Scanner;

public class TempCheck {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is temp?");
		
		int temp=scan.nextInt();
		
		if (temp<32) {
			System.out.println("Water will freeze with temp " + temp);
		}else {
			System.out.println("Water will not freeze with temp " + temp);
		}
		

	}

}
