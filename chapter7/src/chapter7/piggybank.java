package chapter7;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class piggybank {
//linking which values belong to piggy bank
	private static double
	P = 0.01, N= 0.05, D = 0.10, Q = 0.25;
	
	//defining the total of the bank balance value
	private double BB;
	//money formating
	NumberFormat money = NumberFormat.getCurrencyInstance();
	//using a decimal format to keep the correct amount of decimal places
	DecimalFormat deca = new DecimalFormat("#.##");
	
	//constructor method
	public piggybank(double iB)
	{
		BB= iB;
	}
	public double getB()
	{
		return BB;
	}
	public String toString()
	{
		String  BB_String;
		BB_String = ("Your bank balance is: $ " + BB);
		return BB_String;
	}
	public double AddP()
	{
		return P;
	}
	public double AddN()
	{
		return N;
	}
	public double AddQ()
	{
		return Q;
	}
	public double AddD()
	{
		return D;
	}
	public double takeM(double m_out) {
		// TODO Auto-generated method stub
		return  BB - m_out;
	}



}
