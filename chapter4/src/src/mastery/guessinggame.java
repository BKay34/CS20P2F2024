package src.mastery;

public class guessinggame {

}
public static void main(String[] args)
Random random = new Random();
int secretNumber = random.nextInt(20) + 1;  // Generates a number between 1 and 20
Scanner scanner = new Scanner(System.in);

// Prompt the player to enter a number between 1 and 20
System.out.print("Enter a number between 1 and 20: ");
int playerNumber = UserInput.nextInt();

// Display the computer's number and the player's number
System.out.println("Computer's Number: " + secretNumber);
System.out.println("Player's Number: " + playerNumber);

if(playernumber == secretnumber) {
	System.out.print("YOU WON");
	{
	else("YOU LOSE!");
	}
}
	}
}