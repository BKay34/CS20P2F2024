package Skillbuilder;

import java.util.Scanner;

public class Digits 
{
	public static void main(String[] args)
	{

	Scanner UserInput = new Scanner(System.in); 
	System.out.print("Please input a two digit number:		");
	int n =  UserInput.nextInt();
	int baseTen = (n / 10);
	int ones = n%10;
	System.out.println("Your baseTen is:" + baseTen + "your ones is:" + ones);
	}
}