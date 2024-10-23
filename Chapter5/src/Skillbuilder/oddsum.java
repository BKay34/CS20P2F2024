package Skillbuilder;

import java.util.Scanner;

public class oddsum {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		 int i, num, sum=0, oddnum;
		 
		 System.out.println("Enter a number:  ");
		 num = input.nextInt();
		 
		 input.close();
		 
		 for(i=1;i<=num;i+=2)
		 {
			 sum+=i;
		 }
	System.out.println("The sum of odds is: "+sum);
	
	}
}
