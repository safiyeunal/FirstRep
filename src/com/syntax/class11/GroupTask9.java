package com.syntax.class11;

public class GroupTask9 {

	public static void main(String[] args) {
		// Countries by continent
			String[][] countries= {
					{"Argentina","Brazil"},
					{"Cuba","Mexico","Jamaica"},
					{"Algeria","Benin","Chad","Congo"},
					{"Afghanistan","India","Pakistan"},
					{"Albania","Cyprus","Germany"}
						
				};
						
			for(String[] CountryArray:countries)	{
					
			for(String count:CountryArray)	{
								
					System.out.print(count+"   ");
			}		
					System.out.println();
					System.out.println();	
			}		
			System.out.println("Regular Loop---------------");
			
			for(int i=0;i<countries.length; i++){
							
				for(int j=0;j<countries[i].length;j++) {
							
					System.out.print(countries[i][j]+" ");			}
				
				
							System.out.println();
							System.out.println();
							
							
		}
				System.out.println("There are  "+countries.length+ " different continents");
				System.out.println("Countries by number of row");
				System.out.println("South America Countries : " + countries[0].length);
		        System.out.println("Nouth America Countries : " + countries[1].length);
		        System.out.println("African Countries: " + countries[2].length);
		        System.out.println("Asian Countries: " + countries[3].length);
		        System.out.println("Europe Countries : " + countries[4].length);
			}

	}


