package mastery;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Electionmastery {

public static void main(String[] args)
{
Scanner UserInput = new Scanner(System.in);
int doranyc, diegonyc, doranj, diegonj, doracc, diegocc;
DecimalFormat deca = new DecimalFormat ("#.##");
// Asking for votes. 
System.out.println("Enter votes for Dora in New York: ");
doranyc = UserInput.nextInt();
System.out.println("Enter votes for Diego in New York: ");
diegonyc = UserInput.nextInt(); 

System.out.println("Enter votes for dora in New Jersey: ");
doranj = UserInput.nextInt();
System.out.println("Enter votes for Diego in New Jersey: "); 
diegonj = UserInput.nextInt(); 

System.out.println("Enter votes for Dora in Connecticut: ");
doracc = UserInput.nextInt();
System.out.println("Enter votes for Diego in Connecticut: ");
diegocc = UserInput.nextInt();

// calculating total votes
int totvote1 = doranyc + doranj + doracc; 
int totvote2 = diegonyc + diegonj + diegocc; 

int totalvotes = totvote1 + totvote2; 

double percentdora = ((double)totvote1 / (double)totalvotes);
double percentdiego = ((double)totvote2 / (double)totalvotes);
percentdora *= 100; 
percentdiego *= 100;
System.out.println("Candidate      vote      percentage");
System.out.println("Dora           " + totvote1 +"        " + deca.format(percentdora)+"%");
System.out.println("Diego          " + totvote2 +"        " + deca.format(percentdiego)+"%");
System.out.println("totalvotes: " + totalvotes);
}
}
