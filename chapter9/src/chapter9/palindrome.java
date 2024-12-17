/*
 * /*Program: palindrome.java          Last Date of this Revision: dec 14 2024

	Purpose: An application that can check if user inputs word is a palindrome or not.

	Author: Justin Fung,
	School: CHHS
	Course: Computer Programming 20
 * 
 */

package chapter9;

import java.util.Scanner;

public class palindrome {


public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	//creating scanner and array so that userinput is stored
	String phrase;
	char[] letterphrase; 
	
	//boolean method to check if userinput is a palindrome
	boolean Tpalindrome = true;
	
	//asking user for his phrase
	System.out.println("Please enter your phrase: ");
	// converting every digit into a lowercase to make sure the system doesnt make an error when seeing the palindrome and removing all the spaces within an array
	phrase = input.next().toLowerCase();
	phrase = phrase.replaceAll("[^a-z]", "");
    
	//putting each character of the phrase into it's own array
	letterphrase = phrase.toCharArray();
	
	for(int i = 0; i <letterphrase.length; i++) {
	
		//if the palindromes dont match up then the variable made becomes false
		if(letterphrase[i] != letterphrase[letterphrase.length - i-1]) 
			Tpalindrome = false;
	}

	//if the variable made to keep track of whether the phrase is a palindrome isnt true then it is not a palindrome
			if (Tpalindrome == false) {
				System.out.print("Your phrase is not a palindrome");
			} else { //if the variable is true than will output that the phrase is a palindrome
				System.out.print("Your phrase is a palindrome");
			}
	
}
}


/* test case 1:
 * Please enter your phrase: 
oddsandevens
Your phrase is not a palindrome

test case 2:
Please enter your phrase: 

racecar
Your phrase is a palindrome
*/
