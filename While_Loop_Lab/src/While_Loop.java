import java.util.Scanner;

public class While_Loop
{

	public static void main(String[] args) 
	{
		// This is how we call methods. We will talk about how methods work more in future labs.
		
		Example_1(); // This calls the method, called "Example_1()".
		Example_2();
		Example_3();
		Example_4();
		Example_5();
		Your_Own_Code(); // Everything is case and letter sensitive.
		Your_Own_Code_2();
	}

	static void Example_1() // From the main method, the code jumps over here.
	{
		System.out.println("Example 1:");
		// We will look at the syntax of a while loop
		
		int money_made = 100;
		int lemonade_sold = 0;
		int lemonade_cost = 3;
		
		while (money_made < 1000)
		{
			money_made += lemonade_sold*lemonade_cost;
			lemonade_sold++;
		}
		//System.out.println(lemonade_sold);
		// After finishing the while loop, it returns to the main method
	}
	
	static void Example_2()
	{
		System.out.println("Example 2:");
		
		int count = 1;
		int sum = 0;
		
		while (count <= 100)
		{
			sum += count;
			count++;
		}
		System.out.println("The sum is: " + sum);
		//System.out.println(count);
	}
	
	static void Example_3()
	{
		/*
		System.out.println("Example 3:");
		Scanner read = new Scanner(System.in);
		
		// Math.random() creates a random number of type double between 0 and 1.
		int secret_number = (int)(20*Math.random());
		
		System.out.println("Take a \"whiled\" guess.");
		// The backslash, '\', breaks the quotation mark to use at as a literal character.
		int guess = read.nextInt();
		
		// !!!!!!!!!!DO NOT RUN UNTIL YOU HAVE READ THE WHILE LOOP!!!!!!!!!
		while (guess != secret_number)
		{
			System.out.println("Incorrect. Please Try Again.");
			guess = read.nextInt();
		}
		System.out.println("Congratulations. You got the number correct.");
		
		*/
	}
	
	static void Example_4()
	{
		
		System.out.println("Example 4:");
		
		// This program is intended to print positive numbers from 0 to 30 that are divisible by 3.
		
		//boolean condition = true;
		
		int i = 30;
		while (i>3 )
		{
			System.out.print(i + ", ");
			i = (i-3);
		}
		System.out.println(i);
		 
	}
	
	static void Example_5()
	{
		/*
		System.out.println("Example 5:");
	
		Scanner reader = new Scanner(System.in);
		// this is an acceptable way of declaring number.
		// Number does not contain anything though, while sum contains 0.
		double number, sum = 0;
		
		while (true)
		{
			System.out.println("Enter a positive number to continue or a negative number to quit: ");
			number = reader.nextDouble();

			// I don't normally write this way, but this is an acceptable way to write it.
			// break is a command that breaks out of the while loop
			if (number < 0 ) break;
			
			sum += number;
		}
		*/
	}
	
	static void Your_Own_Code()
	{
		/*
		System.out.println("Enter a positive number to continue or a negative number to quit: ");
		Scanner reader = new Scanner(System.in);
		double number = reader.nextDouble();
		while (number > 0)
		{
			System.out.println("Enter a positive number to continue or a negative number to quit: ");
			number = reader.nextDouble();
		}
		*/
	}

	static void Your_Own_Code_2()
	{
		
		int number = 0;
		double numbers = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of terms you want to average: ");
		number = scan.nextInt();
		double sum = number;
	
		if (number > 1) 
		{
			while (sum > 0)
			{
				numbers+= scan.nextDouble();
				sum-= 1;
			}
			System.out.print("The average of your " + number + " numbers is: " + (numbers/number));
		}
		else if (number == 1)
		{
			numbers = scan.nextDouble();
			System.out.print("The average of your number is: " + numbers);
	
		}
		else 
		{
			System.out.println("You have no numbers to average");
		}
	} 
} 