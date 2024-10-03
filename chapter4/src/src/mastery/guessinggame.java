/*
	
	Program: guessinggame.java          Last Date of this Revision: October 2nd 2024

	Purpose: An application that prompts you to guess a number between 1 and 20

	Author: Justin Fung,
	School: CHHS
	Course: Computer Programming 20
	*/ 

package src.mastery;

import java.util.Random;
import java.util.Scanner;

public class guessinggame {


public static void main(String[] args) {
Random random = new Random();
int secretNumber = random.nextInt(20) + 1;  // Generates a number between 1 and 20
Scanner UserInput = new Scanner(System.in);

// Prompt the player to enter a number between 1 and 20
System.out.print("Enter a number between 1 and 20: ");
int playerNumber = UserInput.nextInt();

// Display the computer's number and the player's number
System.out.println("Computer's Number: " + secretNumber);
System.out.println("Player's Number: " + playerNumber);

if(playerNumber == secretNumber) 
{
	System.out.print("YOU WON");
    }
else
{ 
    System.out.println("YOU LOSE!");
}

	}
}



	
