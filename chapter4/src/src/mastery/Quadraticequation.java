/*
	
	Program: Quadraticequation.java          Last Date of this Revision: October 3rd 2024

	Purpose: An application that solves for roots using the quadratic equation

	Author: Justin Fung,
	School: CHHS
	Course: Computer Programming 20
	*/ 

package src.mastery;

import java.lang.Math;
import java.util.Scanner;

public class Quadraticequation {


public static void main(String[] args) {
Scanner UserInput = new Scanner(System.in);

// asking user to enter a, b, c values 
int a, b, c, discriminant, root1, root2;

System.out.println("Please enter the value of a: ");
a = UserInput.nextInt();

System.out.println("Enter a value for b: ");
b = UserInput.nextInt();

System.out.println("Please enter the value of c: ");
c = UserInput.nextInt();

// calculating the discriminant
discriminant = (b * b) - (4 * a * c); 

// checking if discriminant is a real root or not
if(discriminant >=0) {
root1 = (int) (-b + (Math.sqrt(discriminant) / 2 * a)); 
root2 = (int) (-b - (Math.sqrt(discriminant) / 2 * a)); 
	if(root1 == root2) 
		System.out.println("The root of this equation is: " + root1); 
	else 
		System.out.println("The roots of this equation is: " + root1 + "," + root2);
//displaying the roots
}


else {

	System.out.print("Your roots are not real");
}
}
}
/*
 Case 1:
 Please enter the value of a: 
12
Enter a value for b: 
1
Please enter the value of c: 
5
Your roots are not real
Case 2: Please enter the value of a: 
1
Enter a value for b: 
2
Please enter the value of c: 
1
The root of this equation is: -2 
*/