package Skillbuilder;

import java.util.Scanner;

public class numbersum {


public static void main(String[] args) 
{
	Scanner input = new Scanner(System.in); 
	int i, num, sum;
	
	System.out.println("Enter a number: ");
	num = input.nextInt();
	input.close();
	
	for(i=1;i<=num;i++)
	{
		System.out.println(i);
	}
	sum= (int)(0.5*num*(num+1));
	System.out.println("The sum is:  "+sum);
}
}
