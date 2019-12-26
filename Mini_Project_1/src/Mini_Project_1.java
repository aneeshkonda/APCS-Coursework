import java.util.Scanner;

public class Mini_Project_1 {

	public static void main(String[] args) {

		double percent_wanted = 0;
		double percent_currently = 0;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("This is the percent I want:");
		percent_wanted = scan.nextDouble();
		System.out.println("Percentage in the class currently:");
		percent_currently = scan.nextDouble();
		
		double final_grade = ((percent_wanted - (1 - .2) * percent_currently)/.2);
	
		if (final_grade > 100) 
		{
			System.out.println("This is impossible.");
		}
		else 
		{
			System.out.print("The percent I need on the final to get a " + percent_wanted + "% is: " + final_grade + "%");
	
		}
	}
}