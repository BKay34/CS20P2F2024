	package chapter9;

	import java.util.Scanner;
	
	public class coursegrade {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			Scanner input = new Scanner(System.in);
			//Creating GradeBook object
			gradebook kidsgrades = new gradebook();
			//using method to prompt the user for the 5 test grades for each of the 12 students
			kidsgrades.getgrades();
			//method to display the grades of all the students
			kidsgrades.showgrades();
			//prompting user for which student's average they want to see
			System.out.print("Please enter student whose average you want: ");
			//putting users answer as parameter for  method, then will print the return statement of that method as the students's average
			System.out.print("Their average is: " + kidsgrades.studentAvg(input.nextInt())+ "%");
			System.out.println("");
			//prompting user for which test's average they want to see
			System.out.print("Please which test's average you want to see: ");
			//putting users answer as parameter for testAvg method, then will print the return statement of that method as the test's average
			System.out.println("The average is: " + kidsgrades.testAvg(input.nextInt()) + "%");
			
		
	
}

}
/*
 * test case :
 * 
 */
	