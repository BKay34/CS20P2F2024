/**
 * 
 */
package chapter7;

import java.util.Scanner;

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
		
		num placeV = new num(num);
		char choice = ' ';
		while(choice != 'q') { 
		System.out.println("Show (W)hole number. ");
		System.out.println("Show (O)nes number. ");
		System.out.println("Show (T)ens number. ");
		System.out.println("Show (H)undreds number. ");
		System.out.println("(Q)uit. ");
		
		
		String choicestr = input.next().toLowerCase();
		choice = choicestr.charAt(0);

		//Start While loop to keep coming back to options until user inputs 0
		
	// when user chooses W O T H these following cases will occur
		switch(choice) {
		case 'w' : System.out.println("Your integer is: " + placeV.wholeNum()); break;
		
		case 'o' : System.out.println("Your ones place is: " + placeV.onesNum()); break;
	
		case 't' : System.out.println("Your tens place is: " + placeV.tensNum()); break;
	
		case 'h' : System.out.println("Your hundreds place is: " + placeV.hundsNum()); break;
		
		case 'q' : System.out.println("You have quit! ");
		
		// if user enters a incorrect amount
		default: System.out.println("Youve entered a incorrect choice please try again ");
		
		
	}
}}
}