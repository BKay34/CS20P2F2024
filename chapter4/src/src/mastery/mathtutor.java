package src.mastery;

import java.util.Random;
import java.util.Scanner;

public class mathtutor {


public static void main(String[] args)
{
	

Scanner UserInput = new Scanner(System.in);
Random random = new Random();

// number between 1 and 10
int n1 = random.nextInt(10) + 1; 
int n2 = random.nextInt(10) + 1; 

// generating a random operator 
int Randomoperator = random.nextInt(4) + 1;
String operator = "";

int answer;
switch(Randomoperator) {
case 1: operator = "+";
answer = (n1 + n2);
break; 

case 2 : operator = "-";
answer = (n1 - n2);
break;

case 3 : operator = "*";
answer = (n1 * n2);
break;

case 4 : operator = "/";
answer = (n1 / n2);
break;
default:
System.out.print("AN ERROR HAS OCCURED");
return;
}

System.out.println("What is" + n1 + " " + operator + " "  + n2 + "=?"  );
// getting the users answer
int userAnswer = UserInput.nextInt();
//calculating the correct answer

if(userAnswer == answer)
{ 
	System.out.println("YOUR ANSWER IS CORRECT");


}

else
{
System.out.println("YOURE ANSWER IS WRONG");
}
}
}
