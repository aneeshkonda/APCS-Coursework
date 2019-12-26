import java.util.Scanner;

public class Savings {
	//class variables
	private String password = "0zero1one2";
	private double balance;
	private int attempts;
	
	public Savings()
	{
		
	}
	
	public boolean check_PW(String test_PW) 
	{
		if (test_PW.equals(this.password)) 
			return true;
		else 
			return false;	
	}
	
	public void deposit(String PW, double amt)
	{
		if (check_PW(PW) == true)
		{
			this.balance = (get_balance() + amt);
			System.out.println("You have deposited $" + amt + " into your savings account.");
			System.out.println("Your saving account balance is now: $" + this.balance);
			System.out.println();
		}
		else
		{
			this.attempts += 1;
			for(int i = 2; i > 0; i--)
			{
				System.out.println("Wrong password! You have " + i + " attempts remaining.");
				Scanner scan = new Scanner(System.in);
				System.out.print("Try again. Password: ");
				PW = scan.next();
				if (check_PW(PW) == true)
				{
					this.balance = (get_balance() - amt);
					break;
				}
				if (i == 1)
				{
					System.out.println("You are now locked out of this account. The police have been notified. Goodbye.");
				}
			}
		}
	}
	
	public double get_balance()
	{
		return this.balance;
	}
	
	public void withdraw(String PW, double amt)
	{
		if (check_PW(PW) == true)
		{
			this.balance = (get_balance() - amt);
			System.out.println("You have withdrawn $" + amt + " from your savings account.");
			System.out.println("Your saving account balance is now: $" + this.balance);
			System.out.println();
		}
		else
		{
			this.attempts += 1;
			for(int i = 2; i > 0; i--)
			{
				System.out.println("Wrong password! You have " + i + " attempts remaining.");
				Scanner scan = new Scanner(System.in);
				System.out.print("Try again. Password: ");
				PW = scan.next();
				if (check_PW(PW) == true)
				{
					this.balance = (get_balance() - amt);
					break;
				}
				if (i == 1)
				{
					System.out.println("You are now locked out of this account. The police have been notified. Goodbye.");
				}
			}
		}
	}
	
	public void reset_PW(String old_PW, String new_PW)
	{	
		if (check_PW(old_PW) == true)
			{
				this.password = new_PW;
				System.out.println("Your new Savings Account password is: " + new_PW);
			}
			else
			{
				this.attempts += 1;
				for(int i = 2; i > 0; i--)
				{
					System.out.println("Wrong password! You have " + i + " attempts remaining.");
					Scanner scan = new Scanner(System.in);
					System.out.print("Try again. Password: ");
					old_PW = scan.next();
					if (check_PW(old_PW) == true)
					{
						this.password = new_PW;
						System.out.println("Your new Savings Account password is: " + new_PW);
						break;
					}
					if (i == 1)
					{
						System.out.println("You are now locked out of this account. The police have been notified. Goodbye.");
					}
				}
			}
	}
	
}
