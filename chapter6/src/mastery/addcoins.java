package mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class addcoins {

	
	public static void getdollaramount(double quarters, double dimes, double nickels, double pennies)
	{
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
