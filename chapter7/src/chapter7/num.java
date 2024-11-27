/**
 * 
 */
package chapter7;

import java.util.Scanner;


public class num {
// linking all values
 private int num; 

	public num(int integer) {
		num = integer;
	}
		// TODO Auto-generated constructor stub
	
	//method which returns number variable
	
	public int wholeNum() {
		return num;
	}
	public int onesNum() {
		return num%10;
	}
	public int tensNum() {
		return (num/10)%10;
	}
	public int hundsNum() {
		return (num/100)%10;
	}
	
	
}
