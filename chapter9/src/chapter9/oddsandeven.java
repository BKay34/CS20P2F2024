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
			System.out.println("ODD: ");
			
			for( int i = 0; i<25; i++);
			if ((num[max] % 2) != 0) {
				System.out.println(num[max]);
				System.out.println(" ");
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
