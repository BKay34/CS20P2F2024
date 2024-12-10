package chapter7;

import java.text.DecimalFormat;

public class food {

	private double price; 
	private String name; 
	private int fat, carbs, fiber;
	DecimalFormat formatter = new DecimalFormat("#.##");

	// A constructor method that is in use when the price is at $0
	public food(String na,double p, int fats, int carb, int fib) {
		name = na;
		price = p;
		fat = fats;
		carbs = carb;
		fiber = fib;
	}
		public double getPrice()
		{
			return price;
		}
		
		public String toString() {
			String info;
			info = " Each " + name + " has " + fat + "g of fat, " + carbs+ " g of carbs, and "+ fiber+ " g of fiber ";
			return info;
		}	
		// method which returns the price variable which holds the dollar value of the user's order
		public static double total() {
			return price;
		}
		
	}


