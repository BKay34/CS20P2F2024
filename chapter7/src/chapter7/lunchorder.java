package chapter7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lunchorder {


	public lunchorder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating food, scanner and decimal object
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#.##");
	
		
		food burgers = new food("burger", 1.85, 9, 33, 1);
		food salads = new food("salads", 2.00, 1, 11, 5);
		food fries = new food("fries", 1.30, 11, 36, 4);
		food soda = new food("soda", 0.95, 0, 38, 0);
		// prompting user for how many burgers, fries, salads, and sodas they would like, this will also provide them the nutrition information of each 
		System.out.println("Enter number of hamburgers: ");
		int nburgers = input.nextInt(); 
		System.out.println(burgers.toString());
		
		System.out.println("Enter number of salads: ");
		 int nsalads = input.nextInt();
		 System.out.println(salads.toString());
		
		 System.out.println("Enter number of french fries: ");
		 int nfries = input.nextInt();
		 System.out.println(fries.toString());
		 
		 System.out.print("Enter number of sodas: ");
			int nsoda = input.nextInt();
			System.out.println(soda.toString());
			//outputs total amount of money user owes for the food by accessing it through total method
			double totalprice = (nburgers * burgers.getPrice())+ (nsalads * salads.getPrice()) + (nfries * fries.getPrice()) + (nsoda * soda.getPrice());
			System.out.println("Your order comes to: $ " + totalprice);
	}	
	}


