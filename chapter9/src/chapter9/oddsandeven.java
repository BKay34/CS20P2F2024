package chapter9;

import java.lang.Math;

public class oddsandeven {

	

	public static void main(String[] args) {

	
		
		//array
	int[] num = new int[25];
	
	//creating a range for number 0-100
	
	final int min = 0;
	final int max = 100;
	final int range = max - min + 1;
	
	//generating the 25 integers randomly using range and assigning them in the array made to store them
			for( int i = 0; i<25; i++) {
		
				num[i] = (int)(Math.random() * range);
			}
		// TO DISplay all odd numbers. 
			System.out.println("");
			System.out.println("ODD: ");
			
			for( int i = 0; i<25; i++) {
			if ((num[i] % 2) != 0) {
				System.out.println(num[i]);
			
	}
			}
			//Blank output to create space between the even and odd numbers
			System.out.println("");
			//displaying all even numbers
			System.out.println("EVEN:");
			//checking from every number in the array to see which ones are even
			for( int i = 0; i<25; i++) {
				if ((num[i] % 2) == 0) {

					System.out.print(num[i]);
					System.out.print(" ");	
			
			
			
	}
}
	}
	}
	
	/*
	 test case 1:
ODD: 
61 19 45 61 81 43 21 65 59 3 29 95
 

EVEN:
56 38 20 90 4 82 94 44 22 22 24 40 14 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
