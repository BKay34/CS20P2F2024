package mastery;

import java.util.Scanner;

public class digitsmastery {
/*
	
	Program: digitsmastery.java          Last Date of this Revision: September 19/2024

	Purpose: An application that can determine hundreds, tens, and ones values. 

	Author: Justin Fung,
	School: CHHS
	Course: Computer Programming 20
	*/ 
public static void main(String[] args)
{

Scanner UserInput = new Scanner(System.in); 
System.out.print("Please input a three digit number:	");
int n =  UserInput.nextInt();
int baseHundreds = (n / 100);
int baseTen = (n - baseHundreds * 100) / 10;
int ones = n%10;
System.out.println("Your Hundreds place is:		" + baseHundreds);
System.out.println("Your Tens is:	" + baseTen);
System.out.println( "your ones is:	" + ones);

}
}
/* Screen Dump
Please input a three digit number:	159
Your Hundreds place is:		1
Your baseTen is:	5
your ones is:	9
 */