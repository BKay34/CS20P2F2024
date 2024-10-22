/*
	
	Program: guessinggamepta.java          Last Date of this Revision: October 15th 2024

	Purpose: An application that prompts you to guess a number between 1 and 20 which can also allow for infinite guesses

	Author: Justin Fung,
	School: CHHS
	Course: Computer Programming 20
	*/ 

package mastery;
import java.util.Random;
import java.util.Scanner;

public class guessinggamepta {


public static void main(String[] args) {
Random random = new Random();
//delarations
int playerNumber = 0;
int secretNumber;
secretNumber = random.nextInt(20) + 1;  // Generates a number between 1 and 20
Scanner UserInput = new Scanner(System.in);
while(playerNumber != secretNumber)
	{
	System.out.println("Guess a number between 1 and 20: ");
	playerNumber = UserInput.nextInt();
	if(playerNumber == secretNumber) 
	{
		System.out.print("YOU WON");
		break;
		}
	else
	{ 
	    System.out.println("YOU LOSE!");
	}
	}


}
}
/*
 case 1: 
 Guess a number between 1 and 20: 
1
YOU LOSE!
Guess a number between 1 and 20: 
2
YOU LOSE!
 case 2:
 Guess a number between 1 and 20: 
10
YOU WON
*/ 

