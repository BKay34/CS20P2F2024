/**
 * 
 */
package chapter7;

import java.util.Scanner;

/**
 * 
 */
public class digitextractor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a integer: ");
		// declaring variables for place values
		int num = input.nextInt();
		
		// setting up object for num
		
		Number placeV = new number(num);
		
		while(true) { 
		System.out.println("Show (W)hole number. ");
		System.out.println("Show (O)nes number. ");
		System.out.println("Show (T)ens number. ");
		System.out.println("Show (H)undreds number. ");
		System.out.println("(Q)uit. ");
		
		String choice = input.next();

		if (choice.equals("Q")) {
			break;
		
		//Start While loop to keep coming back to options until user inputs 0
		char choice = ' ';
		
	// when user chooses W O T H these following cases will occur
		switch(choice) {
		case 'W' : System.out.printLn("Your integer is: " + .wholeNum()); break;
		}
	
	
	
	}
}