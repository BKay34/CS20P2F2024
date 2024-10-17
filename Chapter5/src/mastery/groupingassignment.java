/*
	
	Program: groupassignment.java          Last Date of this Revision: October 17th 2024

	Purpose: An application that prompts you for your first and last name and then depending on the first letter of your first and last name you will be placed in a group.
	Author: Justin Fung,
	School: CHHS
	Course: Computer Programming 20
	*/ 
package mastery;

import java.util.Scanner;

public class groupingassignment {


public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//declarations 
	String firstname, lastname;
	
	//asking user for their names
	
	System.out.println("Please input your first name");
	firstname = input.next();
	
	System.out.println("Please input your last name");
	lastname = input.next();
	
	//determining which names go within which test
	char letter = (lastname.toLowerCase().charAt(0)); 
	if(letter >= 'a' && letter <= 'i')
	{
		System.out.print(firstname + " " + lastname + " You are in group 1 ");
	}
	else if(letter >= 'j' && letter <= 's')
	{
		System.out.println(firstname + " " + lastname + "You are in group 2 ");
	}
	else
	{
		System.out.println(firstname + " " + lastname + "You are in group 3 ");
	}
}}
/* 
case 1:
Please input your first name
j
Please input your last name
h
j h You are in group 1 
case 2:
Please input your first name
justin
Please input your last name
fung
justin fung You are in group 1 
*/