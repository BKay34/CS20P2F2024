
/*
	
	Program: primenumbers.java          Last Date of this Revision: October 10th 2024

	Purpose: An application that can determine if a number is a prime digit or not.

	Author: Justin Fung,
	School: CHHS
	Course: Computer Programming 20
	*/ 
package mastery;



import java.util.Scanner;



public class primenumbers {



	public static void main(String[] args) {

		// TODO Auto-generated method stub



		//Preparing for user input

		Scanner input = new Scanner(System.in);

				

		//Declaration 

		int un; //user input

		int i; //for loop variable

		boolean prime = false; // finding out if number is prime or not

		

		System.out.println("Enter a number. This program will tell you if it is prime or not: "); //prompt user to enter number

		un = input.nextInt(); //store number in variable

		

		

		

		if (un == 1 || un == 0) // if user input is 1 or 0 then the boolean value is true

		{

			prime = true; 

		

		} 

		

	

		for (i = 2; i <= un / 2; ++i) //Take the numbers between 2 and usernumber

		{

if (un % i == 0) //if the remainder is 0, than that means the number is not a prime

				

			{

				prime = true;

			

			}

		}

		

if (!prime) //if prime is not true

		{

			System.out.print("Your number is prime.");

		}

		else //if prime is true

		{

			System.out.print("Your number isn't prime.");

		}

		

	}



}
/*
case 1:
Enter a number. This program will tell you if it is prime or not: 
3
Your number is prime.
case 2:
Enter a number. This program will tell you if it is prime or not: 
4
Your number isn't prime.
*/