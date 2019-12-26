
public class Runner {

	public static void main(String[] args) 
	{
		Savings saving = new Savings(); //constructor to access savings account
		Checking check = new Checking(); //constructor to access checking account
				
		Spending spend = new Spending("Password", 400); //creating a spending account with password wanted and 400 dollar amount deposited
		
		System.out.println(); //empty space 
		
		check.reset_PW("0zero1one2", "Password"); //reset checking account password with password wanted
		saving.reset_PW("0zero1one2", "Password"); //reset saving account password with password wanted
		
		System.out.println(); //empty space 
		
		check.deposit("Password", 4200); //depositing money in checking account
		saving.deposit("Password", 2500); //depositing money in saving account
		
		check.withdraw("Password", check.get_balance()); //thief empties out checking account
		
		saving.withdraw("wrongpassword", saving.get_balance()); //3 attempts that thief makes on savings account	
		
		
	}

}
