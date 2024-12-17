	/*
 * /*Program: coursegrade.java          Last Date of this Revision: dec 17th 2024

	Purpose: An application that asks you for 12 students test grades, while also able to show the average of the student and their test averages

	Author: Justin Fung,
	School: CHHS
	Course: Computer Programming 20
 * 
 */
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
 * Student 1
Please enter grade for test 1: 55
Please enter grade for test 2: 44
Please enter grade for test 3: 44
Please enter grade for test 4: 44
Please enter grade for test 5: 44
Student 2
Please enter grade for test 1: 55
Please enter grade for test 2: 55
Please enter grade for test 3: 55
Please enter grade for test 4: 22
Please enter grade for test 5: 22
Student 3
Please enter grade for test 1: 55
Please enter grade for test 2: 22
Please enter grade for test 3: 55
Please enter grade for test 4: 22
Please enter grade for test 5: 55
Student 4
Please enter grade for test 1: 22
Please enter grade for test 2: 55
Please enter grade for test 3: 25
Please enter grade for test 4: 52
Please enter grade for test 5: 52
Student 5
Please enter grade for test 1: 77
Please enter grade for test 2: 57
Please enter grade for test 3: 75
Please enter grade for test 4: 75
Please enter grade for test 5: 57
Student 6
Please enter grade for test 1: 57
Please enter grade for test 2: 75
Please enter grade for test 3: 57
Please enter grade for test 4: 57
Please enter grade for test 5: 57
Student 7
Please enter grade for test 1: 75
Please enter grade for test 2: 57
Please enter grade for test 3: 57
Please enter grade for test 4: 77
Please enter grade for test 5: 87
Student 8
Please enter grade for test 1: 87
Please enter grade for test 2: 87
Please enter grade for test 3: 87
Please enter grade for test 4: 78
Please enter grade for test 5: 78
Student 9
Please enter grade for test 1: 78
Please enter grade for test 2: 99
Please enter grade for test 3: 99
Please enter grade for test 4: 97
Please enter grade for test 5: 97
Student 10
Please enter grade for test 1: 97
Please enter grade for test 2: 97
Please enter grade for test 3: 97
Please enter grade for test 4: 97
Please enter grade for test 5: 97
Student 11
Please enter grade for test 1: 97
Please enter grade for test 2: 97
Please enter grade for test 3: 97
Please enter grade for test 4: 97
Please enter grade for test 5: 97
Student 12
Please enter grade for test 1: 97
Please enter grade for test 2: 97
Please enter grade for test 3: 97
Please enter grade for test 4: 97
Please enter grade for test 5: 97
Student 1
Grade for test 1: 55%
Grade for test 2: 44%
Grade for test 3: 44%
Grade for test 4: 44%
Grade for test 5: 44%
Student 2
Grade for test 1: 55%
Grade for test 2: 55%
Grade for test 3: 55%
Grade for test 4: 22%
Grade for test 5: 22%
Student 3
Grade for test 1: 55%
Grade for test 2: 22%
Grade for test 3: 55%
Grade for test 4: 22%
Grade for test 5: 55%
Student 4
Grade for test 1: 22%
Grade for test 2: 55%
Grade for test 3: 252%
Grade for test 4: 52%
Grade for test 5: 52%
Student 5
Grade for test 1: 77%
Grade for test 2: 57%
Grade for test 3: 75%
Grade for test 4: 75%
Grade for test 5: 57%
Student 6
Grade for test 1: 57%
Grade for test 2: 75%
Grade for test 3: 57%
Grade for test 4: 57%
Grade for test 5: 57%
Student 7
Grade for test 1: 75%
Grade for test 2: 57%
Grade for test 3: 57%
Grade for test 4: 77%
Grade for test 5: 87%
Student 8
Grade for test 1: 87%
Grade for test 2: 87%
Grade for test 3: 87%
Grade for test 4: 78%
Grade for test 5: 78%
Student 9
Grade for test 1: 78%
Grade for test 2: 99%
Grade for test 3: 99%
Grade for test 4: 97%
Grade for test 5: 97%
Student 10
Grade for test 1: 97%
Grade for test 2: 974%
Grade for test 3: 97%
Grade for test 4: 97%
Grade for test 5: 97%
Student 11
Grade for test 1: 97%
Grade for test 2: 97%
Grade for test 3: 97%
Grade for test 4: 97%
Grade for test 5: 97%
Student 12
Grade for test 1: 97%
Grade for test 2: 97%
Grade for test 3: 97%
Grade for test 4: 97%
Grade for test 5: 97%
Please enter student whose average you want: 9
Their average is: 94.0%
Please which test's average you want to see: 5
The average is: 70.0%

 */
	