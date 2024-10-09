package mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class projectmastery {
/*
	
	Program: projectmastery.java          Last Date of this Revision: September 24/2024

	Purpose: An application that can determine how much time you've used for designing, coding, debugging, and testing.

	Author: Justin Fung,
	School: CHHS
	Course: Computer Programming 20
	*/ 
public static void main(String[] args)
{
	Scanner UserInput = new Scanner(System.in); 
	NumberFormat nf = NumberFormat.getPercentInstance();

	// declaration 
	double t, d, c, debug;
	System.out.print("Please input time spent on designing");
	d = UserInput.nextDouble(); 
	System.out.print("Please input a time spent on coding "); 
	c = UserInput.nextDouble();
	System.out.print("Please Input time spent debugging ");
	debug = UserInput.nextDouble(); 
	System.out.print("Please Input time spent on testing ");
	t = UserInput.nextDouble();
	
	double total_t = t + d + c + debug; 
	
	d = d / total_t;
    c = c / total_t;
    t = t / total_t;
	debug = debug / total_t; 
	// printing out the data that was calculated
	System.out.print("\ntask:      % time:");
	System.out.print("\ndesigning     "+ nf.format(d));
	System.out.print("\ncoding     "+ nf.format(c));		
	System.out.print("\ndebugging     "+ nf.format(debug));
	System.out.print("\ntesting     "+ nf.format(t));
		
}
}

