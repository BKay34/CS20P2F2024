/*
	
	Program: metricconverion.java          Last Date of this Revision: oct 31st 2024

	Purpose: An application that can convert any user number into a different metric unit.

	Author: Justin Fung,
	School: CHHS
	Course: Computer Programming 20
	*/ 

package mastery;

import java.util.Scanner;

public class metricconversion {



	public static void inchToCenti (int usernumbr) {    
		//declaring variables for conversion calculations
		
		
		
		double conversion = usernumbr * 2.54;
		System.out.println("Your new measurement is:  " + conversion + "Cm");
	}
	
	public static void feetToCenti (int usernumbr) {
		//declaring variables for conversion calculations	
				double conversion = usernumbr * 30.54;
				System.out.println("Your new measurement is:  " + conversion + "Cm");
	}
	
	public static void yardToMeter (int usernumbr) {
		//declaring variables for conversion calculations
				
				double conversion = usernumbr / 1.094;
				System.out.println("Your new measurement is:  " + conversion + "M");
	}
	
	public static void mileToKilometer (int usernumbr) {
		//declaring variables for conversion calculations
				
				double conversion = usernumbr * 1.609;
				System.out.println("Your new measurement is:  " + conversion + "Km");
	}
	
	public static void centiToInch (int usernumbr) {
		//declaring variables for conversion calculations
				
				double conversion = usernumbr / 2.54;
				System.out.println("Your new measurement is:  " + conversion + "Inches");
	}
	
	public static void centiToFeet (int usernumbr) {
		//declaring variables for conversion calculations
				
				double conversion = usernumbr / 30.48;
				System.out.println("Your new measurement is:  " + conversion + "Ft");
	}
	
	public static void meterToYards (int usernumbr) {
		//declaring variables for conversion calculations
				
				double conversion = usernumbr * 1.094;
				System.out.println("Your new measurement is:  " + conversion + "Yards");
	}
	
	public static void KilometerToMiles (int usernumbr) {
		//declaring variables for conversion calculations
				
				double conversion = usernumbr / 1.609;
				System.out.println("Your new measurement is:  " + conversion + "cm");
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
	
	switch (conversion) {
	case 1:
		inchToCenti(usernumbr);break;
	case 2:
	
		feetToCenti(usernumbr);break;
	case 3:
		yardToMeter(usernumbr);break;
	case 4:
	
	mileToKilometer(usernumbr);break;

	case 5:
	
		centiToInch(usernumbr);break;
	
	case 6:
	
		centiToFeet(usernumbr);break;
	case 7:
	
		meterToYards(usernumbr);break;
	
	case 8:
	
		KilometerToMiles(usernumbr);break;
	
	}
}
}
/* case 1:
 Please enter a number:	
15
Conversions: 
Choose a conversion method 1-8:  
1. Inches to Centimeters 
2. Feet to Centimeters 
3. Yards to Meters 
4. Miles to Kilometers 
5. Centimeters to Inches 
6. Centimeters to Feet 
7. Meters to Yards 
8. Kilometers to Miles 
1
Your new measurement is:  38.1Cm
case 2:
Please enter a number:	
14
Conversions: 
Choose a conversion method 1-8:  
1. Inches to Centimeters 
2. Feet to Centimeters 
3. Yards to Meters 
4. Miles to Kilometers 
5. Centimeters to Inches 
6. Centimeters to Feet 
7. Meters to Yards 
8. Kilometers to Miles 
6
Your new measurement is:  0.45931758530183725Ft
*/