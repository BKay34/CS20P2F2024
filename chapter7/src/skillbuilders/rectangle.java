package skillbuilders;

import java.awt.Rectangle;

public class rectangle {

	public rectangle() {
		// TODO Auto-generated constructor stub
	}

}
private double height,width;





public void Rectangle()

{

	height = 1;

	width = 1;

}



public void Rectangle(double h, double w)

{

	height = h ;

	width = w ;

}



public double getWidth()

{

	return (width);

}



public double getHeight()

{

	return (height);

}



public double rectArea()

{

	double area = height * width ;

	return area;

}



public double rectPerimeter() {

	double perimeter = 2*height +2*width ;

	return perimeter;

}



public static void displayRectArea() {

	System.out.println("The formula for the area of a circle is area = length*width");

}



public boolean equals(Object rect)

{	

	Rectangle userrect = (Rectangle) rect;

	

	

	if ((userrect.getWidth() == width && userrect.getHeight() == height)||(userrect.getWidth() == height && userrect.getHeight() == width))

	{

		return true;

	}

	else

	{

		return false;

	}		

}



public String toString()

{

	String rect;

	rect = "The rectangle has a width of " + width + " and a height of " + height;

	

	return(rect);

}

}

