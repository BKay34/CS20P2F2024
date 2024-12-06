package skillbuilders;

import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.util.Scanner;

public class rectanglecli {

	public rectanglecli() {
		// TODO Auto-generated constructor stub
	}

}
public static void main(String[] args) {

	DecimalFormat df = new DecimalFormat("0.00");
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a width for the 2nd rectangle: ");
	double w = input.nextDouble();
	System.out.print("Enter a height for the 2nd rectangle: ");
	double h = input.nextDouble();
	input.close();
	
	Rectangle rect1 = new Rectangle(5,4);
	Rectangle rect2 = new Rectangle();
	
	System.out.println("The perimeter is "+ df.format(rect1.rectPerimeter()));
	Rectangle.displayRectArea();
	System.out.println("The area is " + df.format(rect1.rectArea()));
	
	if (rect2.equals(rect1))
	{
		System.out.println("Both Rectangles are the same.");
	}
	else
	{
		System.out.println("The Rectangles are not the same.");
	}
	
	System.out.println(rect2.toString());
	
	
}}



