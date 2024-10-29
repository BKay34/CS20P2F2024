package chapter6;

import java.util.Scanner;

public class metricconversion {



	public static void inchToCenti (int usernumbr) {    
		//declaring variables for conversion calculations
		Scanner input = new Scanner(System.in);
		
		
		double conversion = usernumbr * 2.54;
		
	}
	
	public static void feetToCenti () {
		//declaring variables for conversion calculations
				Scanner input = new Scanner(System.in);
				double usernumbr = input.nextInt();
				
				double conversion = usernumbr * 30.54;
				
	}
	
	public static void yardToMeter () {
		//declaring variables for conversion calculations
				Scanner input = new Scanner(System.in);
				double usernumbr = input.nextInt();
				
				double conversion = usernumbr / 1.094;
					
	}
	
	public static void mileToKilometer () {
		//declaring variables for conversion calculations
				Scanner input = new Scanner(System.in);
				double usernumbr = input.nextInt();
				
				double conversion = usernumbr * 1.609;
				
	}
	
	public static void centiToInch () {
		//declaring variables for conversion calculations
				Scanner input = new Scanner(System.in);
				double usernumbr = input.nextInt();
				
				double conversion = usernumbr / 2.54;
				
	}
	
	public static void centiToFeet () {
		//declaring variables for conversion calculations
				Scanner input = new Scanner(System.in);
				double usernumbr = input.nextInt();
				
				double conversion = usernumbr / 30.48;
				
	}
	
	public static void meterToYards () {
		//declaring variables for conversion calculations
				Scanner input = new Scanner(System.in);
				double usernumbr = input.nextInt();
				
				double conversion = usernumbr * 1.094;
				
	}
	
	public static void KilometerToMiles () {
		//declaring variables for conversion calculations
				Scanner input = new Scanner(System.in);
				double usernumbr = input.nextInt();
				
				double conversion = usernumbr / 1.609;
				
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//declarations 
	int usernumbr, conversion;
	System.out.println("Please enter a number:	");
	usernumbr = input.nextInt();
	
	//asking user to choose a conversion method 
	
	System.out.println("Conversions: ");
	System.out.println("Choose a conversion method 1-8:  ");
	System.out.println("1. Inches to Centimeters ");
	System.out.println("2. Feet to Centimeters ");
	System.out.println("3. Yards to Meters ");
	System.out.println("4. Miles to Kilometers ");
	System.out.println("5. Centimeters to Inches ");
	System.out.println("6. Centimeters to Feet ");
	System.out.println("7. Meters to Yards ");
	System.out.println("8. Kilometers to Miles ");
	conversion = input.nextInt();
	if(conversion == 1)
	{
		inchToCenti();
		System.out.println("Your new measurement is:  " + conversion + "cm");
	
	}







}
}