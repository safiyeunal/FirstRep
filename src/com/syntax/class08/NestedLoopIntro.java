package com.syntax.class08;

public class NestedLoopIntro {

	public static void main(String[] args) {
		
		for (int i=1; i<3; i++) {
			System.out.println("Outer loop");
			for (int y=0; y<=3; y++) {
				System.out.println("Inner loop");
			}
		}

	}

}
