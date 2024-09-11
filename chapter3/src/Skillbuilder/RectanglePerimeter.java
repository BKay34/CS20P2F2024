package Skillbuilder;

import java.util.Scanner;

public class RectanglePerimeter 
{

	public static void main(String[] args)
	{
		Scanner UserInput = new Scanner(System.in);
		//Declaration and initialization 
		System.out.print("Please input a length value: ");
		int length = UserInput.nextInt();
		System.out.print("Please input a width value: ");
		int width =  UserInput.nextInt();
		
		int area = length * width; 
		
		System.out.print("The Area is equal to: ");
		}
}