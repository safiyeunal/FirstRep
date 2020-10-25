package com.syntax.class11;

public class Creating2DArray {

	public static void main(String[] args) {
		/*
		 * create 2D array of food:
		 * American, Italian, Asian, Afghani, Indian
		 */
		
		String [][] food= {
				
				{"Steak", "Hot Dog", "Burger"},
				{"Pizza", "Pasta", "Canolli"},
				{"Sushi", "Ramen", "Fried Rice", "Dumpling"},
				{"Kebab", "Manto"},
				{"Biryani", "Masala", "Curry", "Chichen tikkak masala"}
				
		};
		
		for (String[] foods:food) {
			for(String dishes:foods) {
				System.out.print(dishes + "  ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------");
		
		for (int i=0; i<food.length; i++) {
			for (int j=0; j<food[i].length; j++) {
				 
				System.out.print(food[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		

	}

}
