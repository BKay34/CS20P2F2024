/*
 * /*Program: lunchorder.java          Last Date of this Revision: dec 5 2024

	Purpose: An application that asks you for a lunch order which then provides all your nutritional facts and your total price.

	Author: Justin Fung,
	School: CHHS
	Course: Computer Programming 20
 * 
 */

package chapter7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lunchorder {


	public lunchorder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating food, scanner and decimal object
		Scanner input = new Scanner(System.in);
		
	
		// showing each parameter.
		food burgers = new food("burger", 1.85, 9, 33, 1);
		food salads = new food("salads", 2.00, 1, 11, 5);
		food fries = new food("fries", 1.30, 11, 36, 4);
		food soda = new food("soda", 0.95, 0, 38, 0);
		// prompting user for how many burgers, fries, salads, and sodas they would like, this will also provide them the nutrition information of each 
		System.out.println("Enter number of hamburgers: ");
		int nburgers = input.nextInt(); 
		System.out.println(burgers.toString());
		
		System.out.println("Enter number of salads: ");
		 int nsalads = input.nextInt();
		 System.out.println(salads.toString());
		
		 System.out.println("Enter number of french fries: ");
		 int nfries = input.nextInt();
		 System.out.println(fries.toString());
		 
		 System.out.print("Enter number of sodas: ");
			int nsoda = input.nextInt();
			System.out.println(soda.toString());
			//outputs total amount of money user owes for the food by accessing it through total method
			double totalprice = (nburgers * burgers.getPrice())+ (nsalads * salads.getPrice()) + (nfries * fries.getPrice()) + (nsoda * soda.getPrice());
			System.out.println("Your order comes to: $ " + totalprice);
	}	
	}

/*

 case 1: 
 *Enter number of hamburgers: 
5
 Each burger has 9g of fat, 33 g of carbs, and 1 g of fiber 
Enter number of salads: 
1
 Each salads has 1g of fat, 11 g of carbs, and 5 g of fiber 
Enter number of french fries: 
5
 Each fries has 11g of fat, 36 g of carbs, and 4 g of fiber 
Enter number of sodas: 6
 Each soda has 0g of fat, 38 g of carbs, and 0 g of fiber 
Your order comes to: $ 23.45
*/
