import java.util.Scanner;
import java.math.*;

public class Lab_2 {

	public static void main(String[] args)
	{
		/* When declaring a variable, we must first distinguish its type.
		 * There are many types, but this lab will only focus on:
		 * integers, doubles and Strings
		 */
		
		int x = 5;
		int y = 12;
		double number = 6.0;
		
		System.out.println("Example 1:");
		//Example 1
		System.out.println(x + number);
		System.out.println(x + " + " + number);
		System.out.println();
		
		// Look carefully at what is being printed
		System.out.println(x + "/" + y + " = " + x/y);
		System.out.println(x + "/" + 12.0 + " = " + x/12.0);
		System.out.println();
		
		System.out.println(6 + "/" + x + " = " + 6/x);
		System.out.println(number + "/" + x + " = " + number/x);
		System.out.println();
		
		System.out.println(number + "/" + y + " = " + number/y);
		System.out.println("6/12.0 = " + 6/12.0);
		System.out.println(y + "/" + number + " = " + y/number);
		System.out.println("12.0/6 = " + 12/6.0);
		System.out.println();
		
		/*
		  There are times where we want to change between the type of number we are dealing with.
		  This concept is known as type-casting.
		  Look closely at example 2 to see exactly how type-casting works.
		 */
		System.out.println("Example 2:");
		//Example 2
		int num1 = 3; //I can call my variable anything I want.
		int num2 = 4;
		double d_num1 = 3.0; // The equivalent of num1 except it is of type double instead of int
		double d_num2 = 4.0; // The equivalent of num2 except it is of type double instead of int
		
		System.out.println(num1 + "/" + num2 + " = " + num1/num2);
		System.out.println(num1 + "/" + num2 + " = " + (double)num1/num2);
		System.out.println(num1 + "/" + num2 + " = " + (double)(num1)/num2);
		System.out.println(num1 + "/" + num2 + " = " + (double)(num1/num2));
		
		System.out.println();
		
		System.out.println(d_num1 + "/" + d_num2 + " = " + d_num1/d_num2);
		System.out.println(d_num1 + "/" + d_num2 + " = " + (int)d_num1/d_num2);
		System.out.println(d_num1 + "/" + d_num2 + " = " + (int)(d_num1)/d_num2);
		System.out.println(d_num1 + "/" + d_num2 + " = " + (int)(d_num1/d_num2));
		
		System.out.println();
		
		System.out.println("Example 3:");
		//Example 3	
		double catering_cost = 530;
		System.out.println("The lunch catering costs $" + (int)catering_cost + ".");
		System.out.println("There are 6 rows with " + x + " number of students.");
		System.out.println("I have " + (6*x+1) + " number of people (including myself) accounted for.");
		System.out.println("Therefore each person needs to pay $" + (int)(catering_cost/(6*x)+1) );
		
		System.out.println();
		
		// Uncomment this portion after answering questions 2 and the closing * / below.
		
		// Example 4
		System.out.println("Example 4:");
		
		// This is how we initialize scanners that read input from the user.
		Scanner read = new Scanner(System.in);
		
		// The print line tells the user what to expect.
		// Replace after you know what the code does.
		System.out.println(" A scanner has been applied, input 5 numbers to find their average "); 
		
		int num_of_terms = 5;
		int total = 0;
		
		// the two statements below are written differently, but accomplish the same task.
		total = total + read.nextInt(); // total is replaced with the addition of a new number.
		total += read.nextInt();
		total += read.nextInt();
		total += read.nextInt();
		total += read.nextInt();

		//	Later, we will talk about how to do repeated tasks (called loops).
	
		double mystery = total/num_of_terms;
		System.out.println("The average of the 5 numbers is " + mystery);
		
		 // Uncomment this after Question 2
		
		// WRITE YOUR OWN CODE
		// START
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a b and c to find the roots of the Quadratic Formula (ax*2 + bx + c)."); 
		System.out.print("Enter a: ");
		double a = scan.nextDouble();
		System.out.print("Enter b: ");
		double b = scan.nextDouble();
		System.out.print("Enter c: ");
		double c = scan.nextDouble();
		System.out.println("Two roots of the quadratic equation occur at x = " + ((-b + Math.sqrt((b*b)-4*a*c)))/(2*a) + " and "  + ((-b - Math.sqrt((b*b)-4*a*c)))/(2*a));
		
		// END
	}
}
