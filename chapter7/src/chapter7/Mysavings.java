/**
 * 
 */
package chapter7;

import java.util.Scanner;

public class Mysavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Prompt user for inital bank balance;

				System.out.println("Enter your initial Balance in dollars: ");
//declaration for intial balance
				double iB = input.nextDouble();
				
				

				//Set up user's bank balance by using object

				piggybank userbank = new piggybank(iB);

				

				//Start While loop to keep coming back to options until user inputs 0

					int choice = 10;

					while(choice !=0)

					{

						//Ask user and present their choices

						System.out.println("1. Enter Total in Bank.");

						System.out.println("2. Add a Penny.");	

						System.out.println("3 Add a Nickel.");	

						System.out.println("4. Add a Dime..");

						System.out.println("5. Add a Quarter.");	

						System.out.println("6. Take out money.");	

						System.out.println("Enter 0 to QUIT");	

						System.out.println("Enter your choice: ");	

						choice = input.nextInt();

						

						switch (choice)

						{

						

						case 0:

							System.out.println("Quitting the program.");

						

						case 1 : 

							System.out.println(userbank.toString());

							break;

							

						case 2 : 

							System.out.println(userbank.AddP());

							break;

							

						case 3 : 

							System.out.println(userbank.AddN());

							break;

							

						case 4 : 

							System.out.println(userbank.AddD());

							break;

							

						case 5 : 

							System.out.println(userbank.AddQ());

							break;

							

						case 6 :

							

							System.out.println("Choose the amount you want to take out: ");

							 double M_out = input.nextDouble();

							 

							System.out.println(userbank.takeM(M_out));

							input.close();

						

					}



					

			}

					System.out.println("Thank you for using this Program.");

		}

		}

