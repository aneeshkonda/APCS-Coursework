import java.util.Scanner;

public class BlackJack_Part_1 {

	static int player_total = 0;
	static int dealer_total = 0;
	
	
	public static int rand() // returns a random number between the begin and end
	{
		int x = (int) (Math.random() * 11) + 1;
		return x; 
	}
	
	public static void stay() 
	{
		// We will use this later
	}
	
	public static int hit() // adds value
	{
		return rand();
	}
	
	public static void dealer_play() 
	{
		System.out.println("\nOkay Dealer's Turn");
		
		int first_card = rand();
		int second_card = rand();
		
		System.out.println("The dealers cards are " + first_card + " and " + second_card + ".");
		dealer_total  = (first_card + second_card);
		System.out.println("His total is " + (dealer_total) + ".");
		
		while(dealer_total < 16) 
		{
			int other = rand();
			System.out.println("\nDealer chooses to hit.");
			System.out.println("Dealer draws a " + other + ".");
			dealer_total += other;
			System.out.println("Dealer''s total is " + (dealer_total) + ".");
		}
		
		System.out.println("\nDealer chooses to stay");
	}
	
	public static boolean check(int total) 
	{
		if(total > 21)
			return true;
		else
			return false;
	}
	
	public static void decide_winner() 
	{
		System.out.println("\nYour total is " + player_total);
		System.out.println("Dealers total is " + dealer_total);
		if(player_total > dealer_total) 
		{
			System.out.println("\nYou win!");
		}
		else 
		{
			System.out.println("\nYou lose!");
		}
	}
	
	public static void run() {
		int first_card = rand();
		int second_card = rand();
		player_total = (first_card + second_card);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Your cards are " + first_card + " and " + second_card + ".");
		System.out.println("Your total is " + (player_total) + ".");
		
		String choice = "";
		System.out.println("Would you like to hit or stay?");
		while(scan.hasNext()) {
			choice = scan.next();
			if(choice.equals("hit")) {
				int other = hit();
				System.out.println("You got a " + other +  ".");
				System.out.println("Your total is " + (player_total + other) + ".");
				player_total += other;
				if(check(player_total) == true) {
					System.out.println("Busted!\nYou lose!");
					break;
				}
				System.out.println("Would you like to hit or stay?");
			}
			else if(choice.equals("stay")) {
				System.out.println("You've chosen to stay");
				dealer_play();
				if(check(dealer_total) == true) {
					System.out.println("Dealer Busted!\n You win!");
					break;
				}
				else {
					decide_winner();
					break;
				}
			}
			else {
				System.out.println("Not a valid choice");
			}
		}
		scan.close();
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Aneesh's Blackjack Casino!");
		System.out.println("Would you like to play Blackjack against me? yes or no");
		
		while(scan.hasNext()) 
		{
			String choice = scan.next().toLowerCase();
			if (choice.equals("yes")) // This is the string comparison
			{
				run();
			}
			else if(choice.equals("no"))
			{
				System.out.println("Goodbye!");
				break;
			}
			else 
			{
				System.out.println("Invalid choice!");
				System.out.println("Would you like to play Blackjack against me? yes or no");
			}
		}
		
		scan.close();
		
	}
}