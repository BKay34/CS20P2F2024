/*
	
	Program: addcoins.java          Last Date of this Revision: nov 4th 2024

	Purpose: An application that asks you for different types of coins and it will total up its value.

	Author: Justin Fung,
	School: CHHS
	Course: Computer Programming 20
	*/ 
package mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class addcoins {

	
	public static void getdollaramount(double quarters, double dimes, double nickels, double pennies)
	{
		//declaring variables and giving each variable a value
		DecimalFormat deca = new DecimalFormat("#.##");
		quarters *= 0.25;
		dimes *=0.10;
		nickels *=0.05;
		pennies *=0.01;
		double amount = quarters + dimes + nickels + pennies;
		System.out.println("Your total is $" + deca.format(amount));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		int quarters, nickels, dimes, pennies;
		System.out.println("Enter your total amount of coins:  ");
		System.out.println("Enter quarter amount:  ");
		quarters = input.nextInt();
		System.out.println("Enter dimes amount:  ");
		dimes = input.nextInt();
		System.out.println("Enter nickels amount:  ");
		nickels = input.nextInt();
		System.out.println("Enter pennies amount:  ");
		pennies = input.nextInt();
		
		getdollaramount(quarters, dimes, nickels, pennies);
		
		
	}

}
/*
Case 1:
Enter your total amount of coins:  
Enter quarter amount:  
90
Enter dimes amount:  
2
Enter nickels amount:  
11
Enter pennies amount:  
25
Your total is $23.5
*/