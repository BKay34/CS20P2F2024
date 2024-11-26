/**
 * 
 */
package chapter7;

import java.util.Scanner;


public class num {
// linking all values
	W, O, T, H; 

	public num() {
		// TODO Auto-generated constructor stub
	
	int n =  UserInput.nextInt();
	int baseHundreds = (n / 100);
	int baseTen = (n - baseHundreds * 100) / 10;
	int ones = n%10;
	System.out.println("Your Hundreds place is:		" + baseHundreds);
	System.out.println("Your Tens is:	" + baseTen);
	System.out.println( "your ones is:	" + ones);
}}
