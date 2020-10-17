package com.syntax.class06;

import java.util.Scanner;

public class CountryLang {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String country;
		String language;
		
		System.out.println("Which country are you from?");
		country=scan.nextLine();
		
		switch (country) {
		
		case "USA":
			language="English";
			break;
		case "Turkey":
			language="Turkish";
			break;
		case "Spain":
			language="Spanish";
			break;
		default:
			language="Not a coutry";
			
		
		}
		System.out.println(language);
	}

}
