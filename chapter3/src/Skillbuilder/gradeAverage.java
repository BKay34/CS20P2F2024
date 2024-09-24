package Skillbuilder;

import java.text.NumberFormat;
import java.util.Scanner;

public class gradeAverage
{
	public static void main (String[] args)
	{
		NumberFormat percent = NumberFormat.getPercentInstance();

	Scanner UserInput = new Scanner(System.in); 
	double averagegrade =  UserInput.nextInt();
 System.out.print("Please Input a grade:	 ");
	averagegrade += UserInput.nextInt();
 System.out.print("Please Input a second grade:  ");
	averagegrade += UserInput.nextInt();
 System.out.print("Please Input a third grade:  ");
	averagegrade += UserInput.nextInt();
 System.out.print("Please Input a fourth grade:  ");
	averagegrade += UserInput.nextInt();
 System.out.print("Please Input a fifth grade:  ");
	averagegrade += UserInput.nextInt();
	
	 averagegrade = averagegrade /500; 
 System.out.print("Your average grade is:    "	grade + );
	}
}