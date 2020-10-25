package com.syntax.class11;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries. 
		 * While retrieving all values from an array print capital for each country.
		 */
		
		String[] countries = { "USA", "Ukraine", "Canada" };
		String[] capitals = { "DC", "Kyiv", "Ottawa" };
		
		for (int v = 0; v < countries.length; v++) {
			System.out.println("The capital of " + countries[v] + " is " + capitals[v]);
		}
		
		System.out.println("------------------------2nd way----------------------------");
		
		String capital;
		for (String country:countries) {
		
			switch (country) {
			case "USA" :
				capital="DC";
				break;
			case "Ukraine":
				capital="Kiev";
				break;
			case "Canada":
				capital="Ottawa";
				break;
			default:
				capital="IDK";
				break;
			}
			
			System.out.println("Capital of " + country + " is " + capital);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
